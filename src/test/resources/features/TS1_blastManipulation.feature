Feature: Menu Blast functionality

  @Positive
  Scenario: CS 1 - User successfully Create New Post, CS 2 - User successfully Edit Description Current New Post, CS 3 - User successfully Archive Current New Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click button Publish
    Then user see success Create Post notification
    When user click option Current Post
    And user click button Edit Post
    And user change description Blast Story
    And user click button Publish Changes
    Then user see success Update Post notification
    When user click option Current Post
    And user click button Archive Post
    And user click OK on confirmation Archive Post page
    Then user see success Archive Post notification


  Scenario: CS 4 - User successfully Create New Post with Insert Attach File
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Icon Attach File
    And user click Allow confirmation setting
    And user choose files to be attached on Post
    And user click button Publish
    Then user see success Create Post notification


  Scenario: CS 5 - User successfully Create New Post with Added Due Date, CS 6 - User successfully Change Current New Post into Private Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    When user click button Due Date
    And user choose Due Date
    And user click button OK on Calendar
    And user click button OK on Watch
    And user click button Publish
    Then user see success Create Post notification
    When user click option Current Post
    And user click button Edit Post
    And user click Private Post Switch
    And user click button Publish Changes Private
    Then user see success Update Post notification


  Scenario: CS 7 - User successfully Create New Private Post, CS 8 - User successfully Edit Description Current New Private Post, CS 9 - User successfully Archive Current New Private Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification
    When user click option Current Post
    And user click button Edit Post
    And user change description Private Blast Story
    And user click button Publish Changes
    Then user see success Update Post notification
    When user click option Current Post
    And user click button Archive Post
    And user click OK on confirmation Archive Post page
    Then user see success Archive Post notification


  Scenario: CS 10 - User successfully Create New Private Post with Insert Attach File
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Icon Attach File
    And user click Allow confirmation setting
    And user choose files to be attached on Post
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification


  @Negative
  Scenario: CS 11 - User failed Create New Post without Blast Information
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user click button Publish
    Then user see Title must be filled notification


  Scenario: CS 12 - User failed Create New Post without Blast Title
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Story
    And user click button Publish
    Then user see Title must be filled notification


  Scenario: CS 13 - User failed Create New Post without Blast Story
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user click button Publish
    Then user see Description must be filled notification


  Scenario: CS 14 - User failed Create New Post with Same Title with Existing Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title Same with Existing Post
    And user input Blast Story
    And user click button Publish
    Then user see success Create Post notification


  Scenario: CS 15 - User failed Create New Private Post without Blast Information
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user click Private Post Switch
    And user click button Publish Private
    Then user see Title must be filled notification


  Scenario: CS 16 - User failed Create New Private Post without Blast Title
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see Title must be filled notification


  Scenario: CS 17 - User failed Create New Private Post without Blast Story
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user click Private Post Switch
    And user click button Publish Private
    Then user see Description must be filled notification


  Scenario: CS 18 - User failed Create New Private Post with Same Title with Existing Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title Same with Existing Post
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification


  Scenario: CS 19 - User successfully Add New Comment on Current Post, CS 20 - User successfully Edit Comment on Current Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click button Publish
    Then user see success Create Post notification
    When user click Current Post
    And user click Add New Comment
    And user click button Submit Comment
    Then user see comment has been added on Current Post
    When user click option Current Comment
    And user click button Edit Comment
    And user input Update Comment
    And user click button Submit Update Comment
    Then user see comment has been edited on Current Post


  Scenario: CS 21 - User successfully Archive Comment on Current Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click button Publish
    Then user see success Create Post notification
    When user click Current Post
    And user click Add New Comment
    And user click button Submit Comment
    Then user see comment has been added on Current Post
    When user click option Current Comment
    And user click button Archive Comment
    And user click OK on confirmation Archive Comment page
    Then user see success Archive Comment notification


  Scenario: CS 22 - User successfully Reply Comment on Current Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click button Publish
    Then user see success Create Post notification
    When user click Current Post
    And user click Add New Comment
    And user click button Submit Comment
    Then user see comment has been added on Current Post
    When user click Reply on Current Comment
    And user click Add Reply Comment
    And user click button Submit Reply Comment
    Then user see reply has been added on Current Comment


    Scenario: CS 23 - User successfully Add New Comment on Current Private Post, CS 24 - User successfully Edit Comment on Current Private Post, CS 25 - User successfully Archive Comment on Current Private Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification
    When user click Current Post
    And user click Add New Comment
    And user click button Submit Comment
    Then user see comment has been added on Current Post
    When user click option Current Comment
    And user click button Edit Comment
    And user input Update Comment
    And user click button Submit Update Comment
    Then user see comment has been edited on Current Post


  Scenario: CS 26 - User successfully Archive Comment on Current Private Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification
    When user click Current Post
    And user click Add New Comment
    And user click button Submit Comment
    Then user see comment has been added on Current Post
    When user click option Current Comment
    And user click button Archive Comment
    And user click OK on confirmation Archive Comment page
    Then user see success Archive Comment notification


  Scenario: CS 27 - User successfully Reply Comment on Current Private Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification
    When user click Current Post
    And user click Add New Comment
    And user click button Submit Comment
    Then user see comment has been added on Current Post
    When user click Reply on Current Comment
    And user click Add Reply Comment
    And user click button Submit Reply Comment
    Then user see reply has been added on Current Comment


  Scenario: CS 28 - User failed Add Null New Comment on Current Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click button Publish
    Then user see success Create Post notification
    When user click Current Post
    And user click button Submit Comment
    Then user see Comments can't be empty notification


  Scenario: CS 29 - User failed Add Null New Comment on Current Private Post
    Given user is on Home page
    And user click Choosen Company
    And user click Choosen Team
    When user click button Menu Blast
    And user click icon Create New Post
    And user input Blast Title
    And user input Blast Story
    And user click Private Post Switch
    And user click button Publish Private
    Then user see success Create Post notification
    When user click Current Post
    And user click button Submit Comment
    Then user see Comments can't be empty notification















#  Scenario: CS 1 - User successfully Create New Post with No Formatting Style, CS 2 - User successfully Change Status Current Post into Complete
#    Given user is on Home page
#    And user click Choosen Company
#    And user click Choosen Team
#    When user click button Menu Blast
#    And user click icon Create New Post
#    And user input Blast Title
#    And user input Blast Story
#    When user click Icon Insert Link
#    And user input text Link
#    And user input URL Link
#    And user click button OK on Insert Link
#    And user click button Publish
#    Then user see success Create Post notification
#    When user click Current Post
#    And user click Tick On Complete on Current Post
#    Then user see success Complete Post notification