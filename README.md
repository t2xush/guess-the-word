Guess The Word Game：

This application is a simple "Guess The Word" game built using Java and Spring Boot. Users guess letters to reveal a hidden word within a limited number of attempts.

Components：
GameService: Handles the game logic, including word selection and processing guesses.

GameController: Manages HTTP requests, updates the game state, and communicates with the web interface.

Web Interface: Provides the UI for user interaction.

Flow：
Initialization: A random word is selected when the game starts.

User Guess: Users submit a guessed character via the web form.

Update and Check: The controller updates the game state and checks if the word is completely guessed.

Feedback: Displays the current state of the word and the number of tries left. Shows a "You won" message if the word is guessed.
