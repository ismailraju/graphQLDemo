# graphql-with-spring-boot
A sample application with GraphQL and Spring Boot


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





{
  foods{
    id
    name
    price
  }
}

 
{
  food(id:12){
    id
    name
    price
  }
}

