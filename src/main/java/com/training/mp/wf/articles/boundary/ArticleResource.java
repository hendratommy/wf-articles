package com.training.mp.wf.articles.boundary;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.mp.wf.articles.entity.Article;

@Path("/articles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticleResource {
	@Inject
	EntityManager em;
	
	@GET
	public List<Article> findAll() {
		return em.createQuery("SELECT a FROM Article a", Article.class).getResultList();
	}
	
	@POST
	@Transactional
	public Article save(Article article) {
		em.persist(article);
		return article;
	}
}
