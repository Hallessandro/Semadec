# Semadec
Atividade desenvolvida para a disciplina de Programação Web I do curso de Tecnologia em Sistemas para Internet do IFRN

Para o devido funcionamento alguns passos a seguir:

1 - Com o projeto já no editor, adicione o drive de conexão do banco, no caso o do MySQL:
    1.1 - Clique com o botão direito em "Bibliotecas" e selecione "Adicionar Biblioteca";
    1.2 - Na janela que abrir, selecione o JDBC do MySQL.
    
2 - Preparando o banco para receber os dados:
    2.1 - Abra o arquivo "FabricaConexao.java", que se encontra no pacote "br.edu.ifrn.semadec.dao"; 
    2.2 - Na linha 19, altera a porta de "3307" para "3306";
    2.3 - O nome do banco "semadec" para o nome do banco que você criou no seu MySQL;
    2.4 - E altera "LOGIN" e "SENHA" para seu login e senha do MySQL.
    
3 - Ao criar o banco, vai ser necessário que esse possua uma tabela, que tenha os campos, nome, modalidade e matricula, sugiro criar a tabela com o nome de "tbl_inscricoes", caso contrário, vai ser necessário alterar o nome da tabela nas consultas presentes no arquivo SemadecDAO.java. 
