package com.example.caching;

import com.example.caching.config.CacheKeyGenerator;
import com.example.caching.ecom.ProductPricesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CacheRunner  {


	@Autowired
	BookRepository simpleBookRepository;

	@Autowired
	CacheKeyGenerator cacheKeyGenerator;

	public void keyGenerate() {
		Set<Integer> cacheKeySet= new HashSet<>();
		for (long l= 1010000L;l<1040000;l++) {
			List<Long> idsJ = Arrays.asList(l);
			ProductPricesDto productPricesDtoJ = new ProductPricesDto();
			productPricesDtoJ.setProductModelIdList(idsJ);
			//int cacheKey= cacheKeyGenerator.createCacheKey(productPricesDtoJ);
			Object msisdn = "5322100210";
			Integer cacheKey= (Integer) cacheKeyGenerator.generate(this, this.getClass().getEnclosingMethod(), true, msisdn, productPricesDtoJ);
			// System.out.println(l + " --- " +  cacheKey);
			cacheKeySet.add(cacheKey);
		}
		System.out.println("SIZE -- " + cacheKeySet.size());

		for (long l= 1010000L;l<1040000;l++) {
			List<Long> idsJ = Arrays.asList(l);
			ProductPricesDto productPricesDtoJ = new ProductPricesDto();
			productPricesDtoJ.setProductModelIdList(idsJ);
			//int cacheKey= cacheKeyGenerator.createCacheKey(productPricesDtoJ);
			Object msisdn = "5322100234";
			Integer cacheKey= (Integer) cacheKeyGenerator.generate(this, this.getClass().getEnclosingMethod(), true, msisdn, productPricesDtoJ);
			// System.out.println(l + " --- " +  cacheKey);
			cacheKeySet.add(cacheKey);
		}
		System.out.println("SIZE -- " + cacheKeySet.size());
		for (long l= 1010000L;l<1040000;l++) {
			List<Long> idsJ = Arrays.asList(l);
			ProductPricesDto productPricesDtoJ = new ProductPricesDto();
			productPricesDtoJ.setProductModelIdList(idsJ);
			//int cacheKey= cacheKeyGenerator.createCacheKey(productPricesDtoJ);
			Object msisdn = null;
			Integer cacheKey= (Integer) cacheKeyGenerator.generate(this, this.getClass().getEnclosingMethod(), true, msisdn, productPricesDtoJ);
			// System.out.println(l + " --- " +  cacheKey);
			cacheKeySet.add(cacheKey);
		}
		System.out.println("SIZE -- " + cacheKeySet.size());
		for (long l= 1010000L;l<1040000;l++) {
			List<Long> idsJ = Arrays.asList(l);
			ProductPricesDto productPricesDtoJ = new ProductPricesDto();
			productPricesDtoJ.setProductModelIdList(idsJ);
			//int cacheKey= cacheKeyGenerator.createCacheKey(productPricesDtoJ);
			Object msisdn = null;
			Integer cacheKey= (Integer) cacheKeyGenerator.generate(this, this.getClass().getEnclosingMethod(), true, msisdn, productPricesDtoJ);
			// System.out.println(l + " --- " +  cacheKey);
			cacheKeySet.add(cacheKey);
		}
		System.out.println("SIZE -- " + cacheKeySet.size());
	}


	public void run() {
		System.out.println(".... Fetching books");
		System.out.println("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
		System.out.println("isbn-4567 -->" + simpleBookRepository.getByIsbn("isbn-4567"));
		System.out.println("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
		System.out.println("isbn-4567 -->" + simpleBookRepository.getByIsbn("isbn-4567"));
		System.out.println("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));
		System.out.println("isbn-1234 -->" + simpleBookRepository.getByIsbn("isbn-1234"));

		List<Long> ids= Arrays.asList(1030981L);
		ProductPricesDto productPricesDto = new ProductPricesDto();
		productPricesDto.setProductModelIdList(ids);
		System.out.println("productPricesDto-1030981L -->" +simpleBookRepository.getProductPrices(true, null, productPricesDto));

		List<Long> ids2= Arrays.asList(1030982L);
		ProductPricesDto productPricesDto2 = new ProductPricesDto();
		productPricesDto2.setProductModelIdList(ids2);
		System.out.println("productPricesDto-1030982L -->" +simpleBookRepository.getProductPrices(true, null, productPricesDto2));

		List<Long> ids3= Arrays.asList(1030983L);
		ProductPricesDto productPricesDto3 = new ProductPricesDto();
		productPricesDto3.setProductModelIdList(ids3);
		System.out.println("productPricesDto-1030983L -->" +simpleBookRepository.getProductPrices(true, null, productPricesDto3));

		List<Long> ids4= Arrays.asList(1030984L);
		ProductPricesDto productPricesDto4 = new ProductPricesDto();
		productPricesDto3.setProductModelIdList(ids3);
		System.out.println("productPricesDto-1030984L -->" +simpleBookRepository.getProductPrices(true, null, productPricesDto3));

		for (int i=0;i<50;i++) {
			List<Long> idsI= Arrays.asList(1030983L);
			ProductPricesDto productPricesDtoI = new ProductPricesDto();
			productPricesDtoI.setProductModelIdList(idsI);
			System.out.println("productPricesDto-1030983L -->" +simpleBookRepository.getProductPrices(true, null, productPricesDtoI));
		}

		for (int j=0;j<50;j++) {
			List<Long> idsJ = Arrays.asList(1030984L);
			ProductPricesDto productPricesDtoJ = new ProductPricesDto();
			productPricesDtoJ.setProductModelIdList(idsJ);
			System.out.println("productPricesDto-1030984L -->" + simpleBookRepository.getProductPrices(true, null, productPricesDtoJ));
		}

		for (long l= 1030000L;l<1040000;l++) {
			List<Long> idsJ = Arrays.asList(l);
			ProductPricesDto productPricesDtoJ = new ProductPricesDto();
			productPricesDtoJ.setProductModelIdList(idsJ);
			System.out.println("productPricesDto-L -->" + simpleBookRepository.getProductPrices(true, null, productPricesDtoJ));
		}

	}

}
