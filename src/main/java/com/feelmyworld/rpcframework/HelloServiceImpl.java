package com.feelmyworld.rpcframework;

/**
 * @author qijian27
 * @since 2019/2/28
 */
public class HelloServiceImpl implements HelloService {

  @Override
  public String hello(String name) {
    return "Hello " + name;
  }

}