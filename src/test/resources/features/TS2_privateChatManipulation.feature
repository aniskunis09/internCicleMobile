Feature: Menu Private Chat functionality

  Scenario: CS 1 - User successfully Send Private Chat
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user input Message to Current Member


  Scenario: CS 2 - User successfully Send Attachment File PDF to Other Member
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user click icon Attach File on Private Chat
    And user click button Document and Video
    And user click Allow confirmation Private Chat setting
    And user choose file PDF to be attached on Private Chat


  Scenario: CS 3 - User successfully Send Attachment File Txt to Other Member
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user click icon Attach File on Private Chat
    And user click button Document and Video
    And user click Allow confirmation Private Chat setting
    And user choose file Txt to be attached on Private Chat


  Scenario: CS 4 - User successfully Send Attachment File Word to Other Member
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user click icon Attach File on Private Chat
    And user click button Document and Video
    And user click Allow confirmation Private Chat setting
    And user choose file Word to be attached on Private Chat


  Scenario: CS 5 - User successfully Send Attachment File Rar to Other Member
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user click icon Attach File on Private Chat
    And user click button Document and Video
    And user click Allow confirmation Private Chat setting
    And user choose file RAR to be attached on Private Chat


  Scenario: CS 6 - User successfully Send Attachment File Zip to Other Member
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user click icon Attach File on Private Chat
    And user click button Document and Video
    And user click Allow confirmation Private Chat setting
    And user choose file ZIP to be attached on Private Chat


  Scenario: CS 7 - User failed Send Null Chat
    Given user is on Home page
    And user click Choosen Company
    When user click button Menu
    And user click menu Inbox
    And user click icon Create New Private Chat
    And user choose Member
    And user click icon Attach File on Private Chat
    And user click button Document and Video
    And user click Allow confirmation Private Chat setting
    And user choose file ZIP to be attached on Private Chat