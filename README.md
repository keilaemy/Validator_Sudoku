# Atividade Sudoku

Esse exercício consiste na elaboração de uma aplicação com múltiplos threads que determine se a solução para um quebra-cabeça Sudoku é válida.
A estratégia sugerida é criar threads em Java que verifiquem os critérios a seguir:
* Um thread para verificar se cada coluna contém os dígitos de 1 a 9
* Um thread para verifica se cada linha contém os dígitos de 1 a 9
* Nove threads para verificar se cada um dos subgrids 3x3 contém os dígitos de 1 a 9
Isso resultaria em um total de onze threads separados para a validação de um quebra-cabeça Sudoku.
