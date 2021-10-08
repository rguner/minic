package com.example.caching;

import com.example.caching.ecom.ProductPricesDto;

public interface BookRepository {

	Book getByIsbn(String isbn);

	Book getProductPrices(Boolean isCached, String msisdn, ProductPricesDto dto);

}
