# **11/08/23** 📅
<h2>Text 1 📄 </h2>
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

<h2>Comentário 1 💬 </h2> 
No primeiro trecho do livro, temos como tema "As diferenças críticas entre programação e engenharia de software". Sendo elas, tempo, escala e compensações (trade-off), partindo disso, os engenheiros direcionam sua "preocupação" com o tempo e necessidades relacionadas as mudanças. Ja na organização de engenharia de software em geral, a preocupação é voltada para escala e eficiência, tanto para o produzido quanto para a organização responsável pela produção. Podemos concluir, um engenheiro de software tem como sua responsabilidade a tomada de decisões complexas de alto risco, sem estimativas em relação a tempo e crescimento.

# **14/08/23** 📅
<h2>Text 2 📄 </h2> 
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

<h2>Comentário 2 💬 </h2>
No segundo trecho do livro, é tratado a relação da programação integrada na engenharia de software ao longo do tempo. Na qual o tempo tem um papel significativo, pois, programar é o primeiro passo para um novo software. Partido desse ponto de vista, podemos concluir a necessidade de projetar tarefas de programação (desenvolvimento), quanto tarefas de engenharia de software (desenvolvimento, modificação, manutenção...). Relacionando também a importância da adição de tempo à programação, citando exemplos...<br></br>

<h2>3 Exemplos de trade-off "da sua cabeça"</h2>

1. No primeiro exemplo vou usar a questão de uma programação, "Nivel de Complexidade e Funções x Manutenção", um programa complexo pode nos oferecer diversas funções que nos auxiliam melhor, porém, se pensarmos no lado da dificuldade de desenvolver e de uma futura manutenção, veremos que é uma questão de perde ganha (trade-off). 

2. Um segundo exemplo, ja mais direcionado a parte hardware, seria "Desempenho x Gastos de Energia", onde um prossesador que tenha seu desenpenho melhorado em questão de sua velocidade, tem por outro lado, um consumo maior de energia.

3. O terceiro exemplo seria em relação a um programa capaz de armazenar/salvar seu login e senha, trazendo a "Facilidade do Acesso x Segurança", onde se em nossa rotina do dia a dia nos pede o acesso em um certo programa, a opção de salvarmos nossos dados de login, nos traz essa facilidade e o rápido acesso, porém, existe a questão de quebra de segurança, que pode acarretar na exposição de nossos dados pessoais. 

# **18/08/23** 📅
<h2>Encontre 1 erro e 1 acerto de cada heurística, "10 Usability Heuristics for User Interface Design"</h2>

<h3>1# Visibility of system status</h3>
Acerto: O feedback ao usuário do status atual  é um ótimo indicador<br></br>
Erro: A falta deu um feedback mais detalhado, pode deixar o usuário esperando sem necessidade

<h3>2# Match between system and the real world</h3>
Acerto: SQL para o usuários <br></br>
Erro: Metáforas do Windows (Pasta, Arquivo...)

<h3>3# User control and freedom</h3>
Acerto Pacote Office (ctrl + Z) <br></br>
Erro: Campos que aceitam ctrl + V, porém, aceitam espaço vazio e acaba "comendo" um caracteres. 

<h3>4# Consistency and standards</h3>
Acerto: WhatsApp <br></br>
Erro: Código sem padronização, podendo leva a bugs

<h3>5# Error prevention</h3>
Acerto: Formatação dos dados <br></br>
Erro: Restrição de senhas muito complexas, pode gerar o esquecimento da mesma nos usuários

<h3>6# Recognition rather than recall</h3>
Acerto: Alexa, onde você pode dar orientações normalmente <br></br>
Erro: Configuração de impressora, com a necessidade de lembra do IP 198.16....

<h3>7# Flexibility and efficiency of use</h3>
Acerto: Atalhos no teclado <br></br>
Erro: A falta de atalhos em certo programas como os de edições, seja de foto, vídeo... 

<h3>8# Aesthetic and minimalist design</h3>
Acerto: Amazon, é simples e com foto no objetivo principal, a venda! <br></br>
Erro: A falta do design minimalista, um loja virtual com várias publicidades espalhadas em janelas 

<h3>9# Help users recognize, diagnose, and recover from errors</h3>
Acerto: Uma mensagem informando onde ocorreu o "erro" como nas liguagens de programação <br></br>
Erro: A falta do Feedback, indicando o motivo do possível erro

<h3>10# Help and documentation</h3>
Acerto: Tutoriais interativos em aplicativos no primeiro acesso <br></br>
Erro: Um programa complexo com várias ferramentos e com poucas informações de como usá-las.

# **21/08/23** 📅
<h2>Caso de Uso</h2>

* Diagrama de Caso de Uso
* UML Unified Modeling 

![image](https://github.com/raulnt/Bertoti/assets/127263427/03d84ffe-bb16-4f1c-88e0-3777d3c3d762)


# **25/08/23** 📅
Primeiro Diagrama UML ![image](https://github.com/raulnt/Bertoti/assets/127263427/efa46bb9-b892-471a-a217-a4ed21826f46)



# **11/09/23** 📅
Upadate do Diagrama de UML ![image](https://github.com/raulnt/Bertoti/assets/127263427/a25d0cc7-e460-4b83-86ea-39e578ed687a)

# **18/09/23** 📅
<summary> Teste JUnit </summary>
<br>

	@Test
	void test() {
		List<Aluno> listaAlunos = new LinkedList<Aluno>();
		
		listaAlunos.add(new Aluno("Raul", "24", "rjbn@", "86.5"));
		listaAlunos.add(new Aluno("Dani", "25", "kdadani@", "56.2"));
		
		List<Professor> listaProfessores = new LinkedList<Professor>();
		
		listaProfessores.add(new Professor("Renato Cariani","noturno","1"));
		listaProfessores.add(new Professor("Julio Balesgreen","diurno","2"));
		
		SistemaAcademia sa = new SistemaAcademia("CT",listaAlunos,listaProfessores);
		
		assertEquals(sa.buscarAlunos("Raul").size(), 1 );

	}
