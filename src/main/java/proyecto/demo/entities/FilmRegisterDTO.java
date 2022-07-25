package proyecto.demo.entities;

import java.util.ArrayList;
import java.util.List;

import proyecto.demo.entities.Film;

public class FilmRegisterDTO {
	
	private Film film;
	
	private int languageId;
	
	private int categoryId;

	private List<String> actors;
	
	public void addActor(String newActor) {
		this.actors.add(newActor);
	}
	
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public List<String> getActors() {
		return actors;
	}


	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public FilmRegisterDTO(Film film, int languageId, int categoryId, List<String> actors) {
		super();
		this.film = film;
		this.languageId = languageId;
		this.categoryId = categoryId;
		this.actors = actors;
	}

	public FilmRegisterDTO() {
		super();
		this.actors = new ArrayList<String>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FilmRegisterDTO [film=");
		builder.append(film);
		builder.append(", languageId=");
		builder.append(languageId);
		builder.append(", categoryId=");
		builder.append(categoryId);
		builder.append(", actors=");
		builder.append(actors);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
