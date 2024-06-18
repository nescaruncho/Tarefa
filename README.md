# Tarefa UD5

Trátase de facer unha aplicación para xestionar as actividades e socios dun centro sociocultural.
Teremos información sobre actividades e socios. Gardaremos as actividades nun ficheiro `actividades.txt` (xestionado con clases do paquete `java.io`), e os socios nun ficheiro `socios.txt` (xestionado con clases do paquete `java.nio`). A entrada e saída por teclado será feita con `JOptionPane`.

A nosa aplicación deberá traballar coas clases `Actividade` e `Socio`.

- A clase `Actividade` terá como atributos: `codActividade`, `nomeActividade`, `horasSemanais`, `prezoActividade`, `salaActividade`. Engade tamén métodos de acceso, construtor, método `toString()` para mostrar a actividade e un método `toStringParaFicheiro()`. Ademais, inclúe os métodos necesarios para validar os datos.
  
- Da clase `Socio`, gardaremos o seu `nome`, `codSocio`, `apelidos`, `email`, `dataNacemento`, `actividadesInscrito` (un array de ata 3 códigos de actividade). Define métodos de acceso e outros métodos necesarios.

A aplicación deberá permitir:
- Xestionar actividades (mostrar todas, engadir, borrar, gardar en ficheiro).
- Xestionar socios (mostrar todos, engadir, borrar, buscar polo apelido, gardar en ficheiro).
- Asignar actividades aos socios (asignar e desasignar).
- Mostrar as actividades dun socio concreto.

Nos ficheiros, tanto das actividades como de socios, os atributos estarán gardados separados por un símbolo da túa elección. As actividades ás que está inscrito cada socio estarán separadas por comas no ficheiro `socios.txt`.

Cando se inicia o programa, se os ficheiros existen, este deberá cargar os datos dos ficheiros de texto, se estes existen.

Cando se engaden os datos, tanto de socio como de actividades, deberás validar os datos de entrada, capturando a excepción que corresponda. Para isto:

- As `horasSemanais` estarán entre 2 e 3.
- O `prezo` da actividade non pode superar os 50 euros.
- A `sala` da Actividade debe ser "Castelao" ou "Dalí".
- O `email` deberá ser validado, para que sexa un email válido, cunha expresión regular.
- A `data` debe ser correcta, podes empregar por exemplo a clase `LocalDate` e o método `LocalDate.of()` para comprobar se a data é correcta.

**ENTREGA:** Comprime a carpeta na que están as clases e os ficheiros `socios.txt` e `actividades.txt`, e súbeo ao aula virtual. Deberás ter polo menos 7 socios e 4 actividades nos ficheiros.
