# some record daily
1. **HttpUrlConnection**  
2. **SelectSort、BubbleSort**
3. **LruCache**  
4. **RxJava2操作符**  
5. LayoutInflater,onResume之后获取getTop有效  
6. 事件分发处理机制  
7. 原型模式 、builder模式  
8. 委托模式，notification  
9. 几种IPC方式实现  
10. 手写binder，其实就是复制AIDL生成的远程服务接口实现；6个步骤
    - [x] Messenger
11. try catch机制
12. 分类，fragment使用
13. DiskLruCache、Retrofit2.0、Annotation、AnnotationProcessor、jni、NDK编程
14. MultiDex
15. customView
16. Display、DisplayMetrics，得到屏幕参数信息(像素、density)
17. Uri说明<br/>
```
<scheme>://<authority><absolute path>?<query>#<fragment>
四部分：sheme、authority、path、query
其中authority又包括：host、port
例如：scheme://host:8080/path1/path?query1=123&query2=test

Android中的 scheme默认是 content://

content://com.example.project:200/folder/subfolder/etc
\-------/\-------------------/\-/\-------------------/
 scheme          host        port        path
         \----------------------/
               authority   
``` 
18.[定位方式](https://github.com/MonkHank/RecordOwn/blob/master/readme18.md)