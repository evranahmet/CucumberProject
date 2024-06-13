@DataTable
Feature: Data Table Test

  @ToDoList
  Scenario: Todo list
    Given user goes to url "https://webdriveruniversity.com/To-Do-List/index.html"
    When user enters todos
      | Prepare breakfast        |
      | Wash the dishes          |
      | Take care of baby        |
      | Help your kid's homework |
      | Study Selenium           |
      | Sleep                    |
      | Get Up                   |
      | Go to school             |
    Then user closes the browser

  @FormMap
  Scenario: Form Page Map
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username and comment
      | john_doe  | Hello John   |
      | tom_zoey  | Hi, everyone |
      | ken_known | Goodbye      |
      | ali_can   | Merhaba!!!   |

    Then user closes the browser

  @FormListOfList
  Scenario: Form Page Map
    Given user goes to url "https://testpages.eviltester.com/styled/basic-html-form-test.html"
    When user enters username password and comment
      | john_doe  | 1234 | Hello John   |
      | tom_zoey  | 5678 | Hi, everyone |
      | ken_known | 9012 | Goodbye      |
      | ali_can   | 3456 | Merhaba!!!   |
      | fatma_yan | 789  | Günaydın!!!  |

    Then user closes the browser
























