package com.example.caching.config;

import java.lang.reflect.Method;

import com.example.caching.ecom.AbstractDto;
import com.example.caching.ecom.ProductPricesDto;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;


@Component
public class CacheKeyGenerator implements KeyGenerator {

	public static final int NO_PARAM_KEY = 0;
	public static final int NULL_PARAM_KEY = 53;

	public Object generate(Object target, Method method, Object... params) {
		if (params.length == 1) {
			return createCacheKey(params[0]);
		}
		if (params.length == 0) {
			return NO_PARAM_KEY;
		}

		int hashCode = 17;
		for (Object object : params) {
			hashCode = 31 * hashCode + createCacheKey(object);
		}

		//System.out.println("HASCODE: " + Integer.valueOf(hashCode));
		return Integer.valueOf(hashCode);
	}

	public int createCacheKey(Object param) {
		if (param instanceof AbstractDto) {
			return createRequestCacheKey((AbstractDto) param);
		}
		return param == null ? NULL_PARAM_KEY : param.hashCode();
	}

	public int createRequestCacheKey(AbstractDto request) {
		if (request instanceof ProductPricesDto) {
			ProductPricesDto dto = (ProductPricesDto) request;
			int hashCode = 17;
			// hashCode = 31 * hashCode + (dto.getMsisdn() == null ? NULL_PARAM_KEY : dto.getMsisdn().hashCode());
			hashCode = 31 * hashCode + (dto.getProductModelIdList() == null ? NULL_PARAM_KEY : dto.getProductModelIdList().hashCode());
			return hashCode;
		}  else {
			return request == null ? NULL_PARAM_KEY : request.hashCode();
		}
	}

}
