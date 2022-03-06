
![This is an image](https://github.com/ismailraju/graphQLDemo/blob/main/graphql-spring-boot.png)
# graphql-spring-boot-demo
Demo fo GraphQL and Spring Boot

### Step:  
1. **Run** the project . in commad line ( $ mvn spring:run )
2. Go to this **URL** ( http://localhost:8080/graphiql )
3. **Insert** Food. :shipit:
    ```
    mutation CREATE_STORE {
      createFood(

          id:12
          name: "boroi"
          price:10.0


      ) {
        id 
        price
        name

      }
    }
    ```
  
 4. **Search** Food. :shipit:

    ```
    {
      foods{
        id
        name
        price
      }
    }
    ```

5. **Search** by id. :shipit:
    ```
    {
      food(id:12){
        id
        name
        price
      }
    }
    ```

