## spring 的设计初衷

1.可以采用Spring来构造任何程序，而不局限于Web程序；
2.轻量级：最少的侵入，与应用程序低耦合，接入成本低；
3，最直观的感受：基于POJO,构建出稳健而强大的应用；



## spring 架构

test:测试，单元测试，继承测试

core container:核心部门，Beans一等公民，core是所有模块的核心，spEL表达式语言；

AOP:CJlib，jdk动态代理

Aspects:提供多种AOP方法

Messaging:报文，可以集成kafuka等消息队列

Data Assess/Integration: 
	JDBC,
	ORM,
	OXM,
	JMS,
	Transactions

Web:
	WebSocket
	WebMVC
	Web
	WebFlux

重点：Beans,Core,Context,AOP;

spring-core:
	1.包含框架基本的核心工具类，其他组件都要使用到这个包里的类。
	2.定义并提供资源的访问方式，为IOC & DI 提供最基础的服务；

spring-beans:spring主要面向Bean编程（BOP）
	Bean的定义：
	Bean的解析：
	Bean的创建：只需关心这一步就行
	最直接的研究的是BeanFactory

spring-context:
	为spring提供运行时环境，保存对象的状态；
	拓展了BeanFactory:
	ApplicationContext:

spring-aop:最小化的动态代理实现
	JDK动态代理
	Cglib
	只能使用运行时织入，仅支持方法级编织，仅支持方法执行切入点；


spring是使用gradle构建的；



## spring源码的下载与编译：
官方网站：spring.io




## 学好Spring的建议
1.阅读Spring官方文档--Spring Framework Reference;
2.多动手调试；
3.掌握设计模式，熟悉Spring框架的标签和注解的作用；



## 软件版本知识点补充
GA:General Availability ，官方正式发布的稳定版本

同质的还有RELEASE,Stable,Final

RC: Release Candidate,发行候选版本，基本不再加入新的功能

Alpha:内部测试版本，bug较多，功能不全，给qa用的

Beta：公开测试版，比Alpha版本晚些，还会加功能，修bug

M:Milestone,开发期发行版本，边开发边发行，对相关软件有信心



## 关于自研框架

目的：为了更好地了解Spring框架

注意的点：会有所取舍，不一定严格与Spring线路同步



## 泛型类:
1.泛型的参数不支持基本类型
2.泛型相关的信息不会进入到运行时阶段

能否在泛型里面使用具备继承关系的类
使用通配符？，但是会使得泛型的类型检查失去意义

给泛型加入上边界 ？ extends E
给泛型加入下边界 ？ extends E

泛型接口可以指定多个泛型；






















