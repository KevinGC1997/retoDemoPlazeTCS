Feature: Test api demoplaze Sing up and Login

  @PostSingUp
  Scenario Outline: Create new user and try to create with the same user
    When I consume the endpoint <test>"<endpoint>"
    Then I can validate the response service <code> and "<message>"

    Examples:
      | test | endpoint | code | message                  |
      | 1    | /signup  | 200  |                          |
      | 2    | /signup  | 200  | This user already exist. |


  @PostLogin
  Scenario Outline: User login successfully and incorrectly
    When I consume the endpoint <test>"<endpoint>"
    Then I can validate the response service <code> and "<message>"

    Examples:
      | test | endpoint | code | message         |
      | 1    | /login   | 200  |                 |
      | 2    | /login   | 200  | Wrong password. |
