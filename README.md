# MDE_HW_A3
Model to Model Transformation (A3.1)

We used the metamodel defined in homework 2 as the version1 and the modified version as version 2 
The following modifications were made to the metamodel from version 1 :

1. Rename concept TransferRequest as Transfer
2. Add concept Wallet
3. Add new hierarchy: Wallet comes under Account
4. Wallet has reference TokenBalance and attribute walletId
5. Delete reference TokenBalance from concept Account
6. Change  attribute leverage  to string (from enum type leverage) in concept Order
7. Rename SavingOrder as SaveToken
8. Delete concept TokenPair, move concepts(tokenA and tokenB) to concept Order
9. Remove reference TokenPair from Order
10. Delete containment TokenNetwork from the root CryptoExchange
11. move TokenNetwork  to concept Subsystem 


Model to HTML (A3.2)
We used Acceleo to define a model to html transformation and the html doc provides information about a cryptoexchange model
