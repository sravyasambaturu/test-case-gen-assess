these are my java files for add status, item, location, vendingmachine and vending status can you generate unittests for each file with coverage greater than 86%

have the before context

mvn clean clover:setup test clover:aggregate clover:clover

![img.png](img.png)

![img_1.png](img_1.png)

mvn test-compile org.pitest:pitest-maven:mutationCoverage

![img_2.png](img_2.png)

![img_3.png](img_3.png)

![img_4.png](img_4.png)

![img_5.png](img_5.png)

