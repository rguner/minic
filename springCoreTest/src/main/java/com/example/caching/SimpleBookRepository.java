package com.example.caching;

import com.example.caching.ecom.ProductPricesDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SimpleBookRepository implements BookRepository {

	@Override
	@Cacheable("books")
	public Book getByIsbn(String isbn) {
		//simulateSlowService();
		return new Book(isbn, "Some book");
	}

	@Override
	@Cacheable(value = "denemeCache")
	public Book getProductPrices(Boolean isCached, String msisdn, ProductPricesDto dto) {
		//simulateSlowService();
		if ( dto.getProductModelIdList().get(0)==1030981) {
			return new Book(dto.toString(), "1030981 book");
		} else if ( dto.getProductModelIdList().get(0)==1030982) {
			return new Book(dto.toString(), "1030982 book");
		}
		return new Book(dto.toString(), "0 book");
	}

	// Don't do this at home
	private void simulateSlowService() {
		try {
			long time = 3000L;
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}

}
