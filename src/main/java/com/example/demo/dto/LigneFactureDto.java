package com.example.demo.dto;

/**
 * Classe permettant d'exposer des données au format JSON d'une ligne de facture.
 */
public class LigneFactureDto {
    public ArticleDto getArticle() {
		return article;
	}

	public void setArticle(ArticleDto article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public ArticleDto article;
    public int quantite;

    public LigneFactureDto(ArticleDto article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }
}
