package com.turkcell.testwebapp.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:9010/testwebapp/cookietest ile calistir, F5 yap...
public class CookieTest extends HttpServlet {

	private static final long serialVersionUID = 993830476414917214L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		final String cookieName = "my_cool_cookie_ramazan";
		final String cookieValue = "my cool value here !"; // you could assign it some encoded value
		final Boolean useSecureCookie = new Boolean(false);
		final int expiryTime = 60 * 60 * 24; // 24h in seconds
		final String cookiePath = "/";

		Cookie[] cookies = request.getCookies();
		int cookieCount = 0;
		PrintWriter out = response.getWriter();

		long allCookiesSize = 0;
		if (cookies != null) {
			cookieCount = cookies.length;
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName() + " " + cookie.getValue());
				out.println(cookie.getName() + " " + cookie.getValue());
				allCookiesSize += cookie.getName().length() + cookie.getValue().length();
			}
		}
		out.println("cookie size " + allCookiesSize);
		HttpSession session = request.getSession();
		out.println("sessionda tutulan cookie count old:" + session.getAttribute("count") + "   " + session.getId());
		session.setAttribute("count", cookieCount);
		out.println("sessionda tutulan cookie count new :" + session.getAttribute("count") + "   " + session.getId());

		Cookie cookie = new Cookie(cookieName + cookieCount, cookieValue + cookieCount);

		cookie.setSecure(useSecureCookie.booleanValue()); // determines whether the cookie should only be sent using a secure protocol, such as HTTPS or SSL

		cookie.setMaxAge(expiryTime); // A negative value means that the cookie is not stored persistently and will be deleted when the Web browser exits. A
										// zero value causes the cookie to be deleted.

		cookie.setPath(cookiePath); // The cookie is visible to all the pages in the directory you specify, and all the pages in that directory's subdirectories

		response.addCookie(cookie);

		out.close();

	}
}
