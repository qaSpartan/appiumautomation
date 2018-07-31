Feature: Checkout the Product using Amazon app
Description:The purpose of this test is to place an order using Amazon app.

  @LoginUsingValidCredentials
  Scenario: SignIn using valid credentials
    Given user is at Amazon app Home page
    When Click SignIn button
    And Provide valid email address and Password
    Then User has successfully logged in

  @SearchProduct
  Scenario: Search Product using Amazon app
    Given click for search textbox
    When provide product name
    Then product search is successfull
    
   @SelectProductAddToCart
    Scenario: Select Product using Amazon app
    Given Registered user has at Product page
    When selecting product attributes
    And Add product to cart
    Then product successfully added to cart
    
    @ProceedtoCheckout
    Scenario: Product Checkout using Amazon app
    Given Registered user at Basket page
    Then user successfully proceed to checkout
    
    
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

   
