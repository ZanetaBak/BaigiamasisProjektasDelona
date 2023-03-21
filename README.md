
# Project DELONA
## Setup
### Site used for testing
[delona Homepage](https://www.delona.lt/index.php?route=common/home)

[Login form] (https://www.delona.lt/index.php?route=account/login)



## Test cases

### TC1 LOGIN

TC1.1 Log in with existing account information (LogInWithExistingAccountInfo)

TC1.2 Log in with non-existing account information (testLogInAttemptWithNonExistingAccountInfo)


TC1.1  *Test of log in with existing account information*
1. Open log in page
2. Input email(zaneta.bakanauskiene@gmail.com) and password(vcsbaigiamasis)
3. Click "Login" button
3. Click "Keisti paskyros informaciją"
4. Check if user's surname (Bakanauskienė) is correct
5. Logout

TC1.2 *Login attempt with non-existing/incorrect account information*
1. Open log in page
2. Input email(kazkas@email.com) and password(password)
3. Click "Login" button
4. Alert message appears, check if alert message contains "Įspėjimas"


### TC2 PRODUCT SEARCH WITH SEARCH BAR
TC2.1 Search with existing product information (searchWithAvailableProductInfo)
TC2.2 Search with non-existing product information (searchWithNonAvailableProductInfo)

TC2.1. *Search with existing product information*
1. Open Home page
2. Add name of available product (   ) to search bar
3. Click "Search" button
4. Check if any product is found

TC2.2. *Search with non-existing product information*
1. Open Home page
2. Add name to search bar of a product not available in the store (grybai)
3. Click "Search" button
4. Check if a message is displayed that such product is not available


### TC3 **ADD TO CART TEST**
TC3.1 *Add item to cart* (addItemToCart)

1. Open page of one of the items (Ciberžolė) in the Store
2. Click on button "1kg"
3. Add input quantity (5)
4. Click "Add to cart" button
5. Click "Go to basket" button
6. Check if cart icon shows that the item is in the cart
