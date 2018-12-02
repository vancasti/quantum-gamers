# Quantum Gamers
A company that organizes online videogame tournaments needs a program that is responsible for pairing them for the competitions.
The players are composed of name, last name, wit and speed.

There are 2 different types of players and each one calculates their skill level (ELO) in different ways:
- Carry: speed * 2 + ingenuity * 0.5
- Trainer: ingenuity * 3 + speed * 0.2

Given 20 teams of 5 players, each of them of random type and attributes, has a program that calculates the most fair match between
The equipment and the sample by the result.
You also need to be able to get a list with the top 5 players and one of the top 5 teams.

The solution has been to calculate the average score of a team from the ELO of each of its members. Once we have all the teams and their score, we sort them into a list of higher to lower score and we pair them two by two, in this way they will play teams that have a very similar level.

