# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git

Configurar nome e email de usuário é essencial o para a indentificação e rastreamento de commits, além de evitar possíveis erros de commit associados a identidade.

```bash
# Configure seu nome e email (usado para identificar o autor dos commits)

git config −−global user.name "Seu Nome Completo"
git config −−global user.email "seu−email@example.com"
```

### Criando Personal Access Token (PAT) no GitHub

O PAT (Personal Access Token) é um método de autenticação seguro que substitui a sua senha. Ela oferece maior segurança, obrigando o uso de Autenticação de Dois Fatores (2FA) e permitindo a revogação de acesso da chave.

Siga o passo a passo para criar e usar um PAT

1. Acesse o GitHub
2. Vá em Settings > Developer settings > Personal access tokens > Tokens (classic) > Generate new token.
3. Defina um nome, expiração e selecione as permissões (escopos), como repo para repositórios. 
4. Copie o token imediatamente, pois ele não será exibido novamente. 

> **Observação:** NÃO coloque esse código em lugares suscetíveis a ataques (Ex: Email). Caso tenha perdido acesso ao Token, basta ir na página e reativar a Token ou excluir e criar outra.

### Salvar em cache as credenciais do PAT

Não é necessário fazer a autenticação a cada commit/push, é possível salvar as credenciais de acesso ao GitHub em cache 

```bash
# Irá armazenar as credenciais na memória por 15 minutos
git config −−global credential.helper cache

# Caso queira armazenar por mais tempo, use (irá armazenar por 1 hora)
git config −−global credential.helper 'cache −−timeout=3600'
```

### Qual a diferença entre git merge e git rebase?

Ao realizar o controle de versão em uma equipe, é possível que este controle envolva administrar os possíveis conflitos em arquivos quando dois ou mais desenvolvedores alteram o mesmo trecho de código ao mesmo tempo. Nesse tipo de situação, temos duas vias de solução:

* Git Merge: O comando git merge fará a junção das alterações feitas à base de código em uma branch separada à sua branch atual como um novo commit.

```bash
git merge NOME-DA-BRANCH
```

* Git Rebase: O comando git rebase altera o histórico de commits. Fazer o rebase de uma branch no Git é uma maneira de mover toda uma branch para outro ponto da árvore.

```bash
git rebase master/main
```

Utilize o **Merge** quando o objetivo for integrar o trabalho finalizado à branch principal, priorizando a visibilidade de como e quando as funcionalidades foram unidas. Já o **Rebase** deve ser sua escolha para manter sua branch de trabalho organizada e atualizada, garantindo um histórico limpo e linear. 