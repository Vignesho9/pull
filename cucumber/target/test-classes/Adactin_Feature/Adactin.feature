Feature: Hotel Booking In Adactin Application

@Ad1
Scenario: Login
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In The Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page
@Ad2
Scenario: Search Hotel
When user Select The Location
And user Select The Hotels
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click The Search Button And It Navigates To The Select Hotel Page
@Ad3
Scenario: Select Hotel
When user Click On The Select Button
Then user Click On The Continue Button And It Navigates To The Book Hotel Page
@Ad4
Scenario: Book Hotel
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Enter The Credit Card Type
And user Enter The Expiry Date Month
And user Enter The Expiry Date Year
And user Enter The Cvv Number
Then user Click On The Book Now Button And It Navigates To The Booking Conform Page
@Ad5
Scenario: Booking Itinerary
The user Click On The My Itinerary Button And It Navigates To The My Itinerary Page
@Ad6
Scenario: Logout
Then user Click On The Logout Button And It Navigates To The Home Page


 