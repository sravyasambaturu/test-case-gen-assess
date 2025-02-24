Randoop and Open Clover

Install Randoop and openclover, prerequisites: java and maven in systsem
C:\Users\91950\Downloads\test-case-gen-assess\randoop_test_cases_gen\ATM\ATM

java -classpath "C:\Users\91950\Downloads\test-case-gen-assess\randoop_test_cases_gen\ATM\ATM\target\classes;C:\Program Files\randoop-4.3.3\randoop-all-4.3.3.jar" randoop.main.Main gentests --classlist=C:\Users\91950\Downloads\test-case-gen-assess\randoop_test_cases_gen\ATM\ATM\classlist.txt --time-limit=60 --junit-output-dir=C:\Users\91950\Downloads\test-case-gen-assess\randoop_test_cases_gen\ATM\ATM\src\test\java\edu\hawaii\ics\peruma

![img.png](img.png)

![img_1.png](img_1.png)

Clover plugin in maven

    <build>
        <plugins>
            <plugin>
                <groupId>org.openclover</groupId>
                <artifactId>clover-maven-plugin</artifactId>
                <version>4.5.2</version>
            </plugin>
        </plugins>
    </build>

![img_2.png](img_2.png)

Go to C:\Users\91950\Downloads\test-case-gen-assess\randoop_test_cases_gen\ATM\ATM\target\site\clover\index.html

Right click to open with any browser and you can see the test reports.

View Reports in target/site/clover/index.html.