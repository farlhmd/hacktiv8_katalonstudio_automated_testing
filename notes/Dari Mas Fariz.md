Slack Notes dari Mas Fariz:
1. In case ada yg butuh website/API/App dummy buat latian (akan di update secara berkala seiring berjalannya topik kelasnya):\
                https://opensource-demo.orangehrmlive.com/
                https://www.saucedemo.com/

2. API code JIRA Katalon: anA0axRjORTOhnI9ZdDtACB9

3. Tentang sample BDD Cucumber Project:\
    https://docs.katalon.com/docs/katalon-studio-enterprise/get-started/sample-projects/sample-bdd-cucumber-tests-project

    

4. Handling Dropdown:\
        by Index: https://docs.katalon.com/docs/katalon-studio-enterprise/test-execution/advanced-guides/web-testing/how-to-handle-drop-down-menu#select-option-by-index \
        by Value: 

5. Data Driven Testing via Database MySQL:\
        https://docs.katalon.com/docs/katalon-studio-enterprise/test-execution/data-driven-testing/implement-data-driven-testing-with-mysql

6. Custom Keyword dengan Database:\
        https://docs.katalon.com/docs/katalon-studio-enterprise/extend-katalon-studio/custom-keywords/how-to-perform-database-testing-using-katalon-studio
        Contoh custom keyword orang lain:\
                Handle Calendar: https://medium.com/dsf-developers/utilize-custom-keywords-in-katalon-studio-c52b46e82b39
                Ashot Keyword Plugin (Visual testing): https://github.com/katalon-studio/katalon-studio-ashot-plugin

7. Tentang jira integration bisa cek disini, atau bisa cek jg di modul utk sesi 8 (besok senin):\
https://docs.katalon.com/docs/katalon-studio-enterprise/integration/jira-integration/jira-integration

8. Decision Making Statements (if-else):
https://docs.katalon.com/docs/katalon-studio-enterprise/create-tests-and-projects/manage-projects/statements/decision-making-statements \
    inget: klo misal mau bikin verifikasi dengan suatu keyword WebUI, maka jgn lupa kasih "failure handling"nya juga (optional, atau continue on failure) di dalam if-elsenya, sehingga contohnya seperti ini:

    if (WebUI.verifyElementPresent(findTestObject('Appointment Page/h2_Make Appointment'), 3, FailureHandling.OPTIONAL) == true) {
                
          println('ini berhasil gaess')

          WebUI.verifyElementPresent(findTestObject('Appointment Page/h2_Make Appointment'), 3, FailureHandling.OPTIONAL)
                
     } else {
                
          println('ini gak berhasil!')
                
            }


9. Buat error jenkins yg "MS Edge driver Error" atau devtoolsactiveport file doesn't exist:

        coba cek thread ini di stackoverflow
        intinya coba tambahin diantara ini di command line nya:
        add --headless
        add --remote-debugging-port=<port>


10. Bacaan Tips pull request (reference: mamikos):\
    https://medium.com/mamitech/pull-request-principles-in-mamikos-ab6a7390aeac

11. Referensi mengenai API Chaining Request:
https://medium.com/easyread/chaining-request-in-rest-api-using-katalon-studio-127165d7d711

12. Preparation Mobile App Automation:\
        1. Java, set up java home\
        2. Emulator / real device Android
        Emulator opsinya:\
        - Genymotion (daftar, bisa gratis). download yg sama virtual box nya juga\
        - Android Studio\
        3. Buat yg pake emulator: Create device emulation, speknya bebas, atau at least:\
        - Device bebas\
        - RAM 2 atau 3GB\
        - OS: Android 6\
        - resolution 1080x1920 (atau yg lebih kecil, tp jgn kekecilan juga), density/ppi/pixel yg rendah aja biar enteng\
        3. NodeJS\
        4. Appium

13. Link download APK (buat alternatif klo misal dari modul gabisa di download):\
    https://drive.google.com/file/d/1xGE8wdiCKzfKWvMeEpwafXScxn-rpZbO/view?usp=sharing

14. Untuk final project sesi 12, aku kasih alternatif jg bisa pake API ini:\
    https://restful-booker.herokuapp.com/apidoc/index.html

15. Definisi Final Project Katalon (recap / summary):\
        1. Bikin test plan dokumen sesuai platform (template ada di modul sesi 12 hacktiv8)\
        2. Bikin masing2 project Katalon terpisah untuk web, api, dan mobile\
        3. Create task card di Jira. dengan format Summary: [NAMA]-TC Login Website ; Deskripsi: penjelasan dikit tentang test casenya ; Gherkin Steps: bikin gherkin steps utk test casenya. (sesuaikan dengan projectnya juga), kemudian masing2 di import test case dari jira ke katalon (sambil aku troubleshoot gimana caranya gherkin stepnya biar muncul, soale aneh ni, dulu aku bisa langsung nongol soalnya)\
        4. lanjut bikin test case yg lain, sesuai platformnya.\
        5. klo udah, submit via git masing2 repo nya (INGET: COMMIT/PUSH BERKALA YA... jangan cuma sekali publish. tak amatin nanti commit2 messagenya. mau pake sistem branch jg boleh buat jadi nilai plus)\
        6. untuk dokumen test plan, bisa langsung di masukin di masing2 folder project katalon nya. biar nanti langsung terhubung di project katalon nya.

    CONTOH REAL CASEnya:\
        1. mas farhan bikin test plan dokumen\
        2. trus bikin new project katalon utk website\
        3. setting Katalon x JIRA nya dulu\
        4. create ticket, type task (test case) di project website di Jiranya. dengan format Summary: Farhan-TC Login Website ; Deskripsi: test case login untuk website blablabla ; Gherkin Steps: given blablabla, when bllabla, dstnya\
        5. IMPORT task tsb dari Jira ke Katalon (dengan JQL/plugin Jira)\
        6. bikin script automation test nya yg lain (sementara ini, masih belum terintegrate dulu aja. kalo udah ketemu solutionnya, aku update lagi utk teknis flow create test casenya)\
        7. file test plan tadi, dimasukin di folder yg sama dengan project website\
        8. kalo udah, lakuin step 1-7 di platform lain: API, Mobile App


16. Untuk GIT IGNORE:\
        wajib tambahkan ini ya:

        .cache
        .Project

    walaupun udah ada .project , tetep bikin yg capital ya (.Project)\
    jadi tetep pake .gitignore bawaan katalon, tp tambahin 2 key diatas itu, buat meminimalisir kena bug .project yg bikin project kalian ga bisa di clone karena conflict (entah ini bug dari jaman kapan, tp sering aku temui dan cara resolvenya begitu) 


17. untuk yg testing mobile app pake keyword "startexistingapplication", cara nge kill/end applicationnya gini:
        
        Mobile.startExistingApplication('com.package.name')
        driver = MobileDriverFactory.getDriver()

        /*kemudian script ATnya sesuai kebutuhan*/

        driver.terminateApp('com.package.name')

18. Common FAQ utk MacOS/iOS app:\
      1. Path appium gak ke detect
      ada 2 macem solusinya:\
      a. cek path nya katalon, pake yang ini

        /opt/homebrew/lib/node_modules/appium

      b. (RESOLVING MOST ISSUE DI MACOS):
        jalanin katalon dengan terminal,
        
        open -a /Applications/Katalon\ Studio.app
