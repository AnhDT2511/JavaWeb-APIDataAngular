## JavaWeb-APIDataAngular

- MySQL
- Gson `List` to `List Json`
```java
Gson gson = new Gson(); 
String json = gson.toJson(list, new TypeToken<List<Product>>() {}.getType());
```
