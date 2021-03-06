/*
 * The Spring Framework is published under the terms
 * of the Apache Software License.
 */
 
package com.interface21.beans.factory;

/**
 * Interface to be implemented by com.interface21.beans that wish to be notified
 * of lifecycle events by their owning BeanFactory. Also provides
 * a way that com.interface21.beans can obtain a reference their owning BeanFactory,
 * which they can use to look up collaborating com.interface21.beans.
 * @author Rod Johnson
 * @since 11-Mar-2003
 * @version $Revision: 1.1 $
 */
public interface Lifecycle {
	
	/**
	 * Lifecycle callback com.interface21.beans used in a BeanFactory can
	 * implement to receive callbacks exposing the com.hhx.beans.factory itself.
	 * This enables them to obtain other com.interface21.beans from the com.hhx.beans.factory.
	 * <br>
	 * If the bean also implements InitializingBean, Lifecycle methods 
	 * will be invoked after the <code>afterPropertiesSet</code>
	 * method.
	 * @param beanFactory owning BeanFactory. May not be null.
	 * The bean can immediately call methods on the com.hhx.beans.factory.
	 * @throws Exception this method can throw any exception. Normally
	 * we want methods to declare more precise exceptions, but
	 * in this case the owning BeanFactory will catch and handle the
	 * exception (treating it as fatal), and we want 
	 * to make it easy to implement Lifecycle com.interface21.beans by freeing developers
	 * from the need to catch and wrap fatal exceptions. Exceptions thrown
	 * here are considered fatal.
	 */
	void setBeanFactory(BeanFactory beanFactory) throws Exception;
	
	// TAKE PVS?
	//void propertyChange();
	
	//void dispose();

}
