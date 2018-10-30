package com.mkyong.movie;

public interface MovieDao {

	Movie findByDirector(String name);

	public void cacheSilme();

	public void cacheBilgi();

}
