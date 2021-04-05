# Lights Out

Exploring the traditional game Lights Outs, a 5x5 grid where pressing a light 
toggles the state of it and also its four neighbours. The goal of the game is
to get all lights into off state.

This project will list all valid boards (assuming not all boards are valid), 
and also one of teh the shortest path to lights out.

## Assumptions

Board space is small (2^25) so all boards can be explored using a regular 
computer memory and cpu.

Not all boards will be valid. Has been proven mathematically, but since the
board space is so small exhaustive search will list all combinations
