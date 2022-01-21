package com.ozanaydogan.b1.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@_2_YolKesiciInterface
@Interceptor
public class _1_YolKesiciMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("önceki durumum " + context.getMethod().getName() + " " + context.getClass());
		
		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Öncelikle üye olunuz !");
			return null;
		} else {
			try {
				isContinue = context.proceed();// işaretlendi
				System.out.println(" Login olduktan sonra : Yönlendirme yapılıyor Admin sayfasına gidiyorsunuz");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
