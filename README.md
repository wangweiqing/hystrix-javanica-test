# hystrix-javanica-test  
This project is test for hystrix-javanica with spring.
```
$ git clone git@github.com:wangweiqing/hystrix-javanica-test.git
$ cd hystrix-javanica-test
$ ../gradlew jettyRun
```

## test method
run test command with curl
```
curl http://127.0.0.1:8080/hystrix-javanica-test/test
```

## my test result
```
 INFO [1592010632@qtp-620708359-0] 2016-07-12 14:37:47.822 com.wwq.hystrixtest.service.impl.AServiceImpl.getTest(AServiceImpl.java:26) Hystrix test start!
 INFO [hystrix-AClient-2] 2016-07-12 14:37:47.824 com.wwq.hystrixtest.client.AClient.getTest(AClient.java:22) Hystrix Get Test
 INFO [1592010632@qtp-620708359-0] 2016-07-12 14:37:50.305 com.wwq.hystrixtest.service.impl.AServiceImpl.getTest(AServiceImpl.java:26) Hystrix test start!
 INFO [hystrix-AClient-3] 2016-07-12 14:37:50.307 com.wwq.hystrixtest.client.AClient.getTest(AClient.java:22) Hystrix Get Test
 INFO [1592010632@qtp-620708359-0] 2016-07-12 14:37:52.323 com.wwq.hystrixtest.service.impl.AServiceImpl.getTest(AServiceImpl.java:26) Hystrix test start!
 INFO [hystrix-AClient-4] 2016-07-12 14:37:52.325 com.wwq.hystrixtest.client.AClient.getTest(AClient.java:22) Hystrix Get Test
 INFO [1592010632@qtp-620708359-0] 2016-07-12 14:37:53.903 com.wwq.hystrixtest.service.impl.AServiceImpl.getTest(AServiceImpl.java:26) Hystrix test start!
 INFO [hystrix-AClient-5] 2016-07-12 14:37:53.905 com.wwq.hystrixtest.client.AClient.getTest(AClient.java:22) Hystrix Get Test
 INFO [1592010632@qtp-620708359-0] 2016-07-12 14:37:56.429 com.wwq.hystrixtest.service.impl.AServiceImpl.getTest(AServiceImpl.java:26) Hystrix test start!
 INFO [hystrix-AClient-6] 2016-07-12 14:37:56.430 com.wwq.hystrixtest.client.AClient.getTest(AClient.java:22) Hystrix Get Test
```