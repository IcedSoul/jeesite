//package com.thinkgem.jeesite.aop;
//
//import org.springframework.aop.framework.*;
//
///**
// * @author IcedSoul
// * @data 19-4-8 下午8:20
// */
//public class ProxyFactory extends DefaultAopProxyFactory {
//    @Override
//    public AopProxy createAopProxy(AdvisedSupport config) throws AopConfigException {
//        if (!config.isOptimize() && !config.isProxyTargetClass() && !this.hasNoUserSuppliedProxyInterfaces(config)) {
//            return new JdkDynamicAopProxy(config);
//        } else {
//            Class<?> targetClass = config.getTargetClass();
//            if (targetClass == null) {
//                throw new AopConfigException("TargetSource cannot determine target class: Either an interface or a target is required for proxy creation.");
//            } else {
//                return (AopProxy)(targetClass.isInterface() ? new JdkDynamicAopProxy(config) : new ObjenesisCglibAopProxy(config));
//            }
//        }
//    }
//}
