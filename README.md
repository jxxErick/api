# Testando 

Metodo Post 
<img src="https://i.imgur.com/wgWK6a3.png">


Metodo get que busca todos 
<img src="https://i.imgur.com/ot4c8NJ.png">

Metodo get por id 
![image](https://user-images.githubusercontent.com/91636663/167698230-fee218d9-6463-400e-83c1-b5ea1d4ce54f.png)

![image](https://user-images.githubusercontent.com/91636663/167698383-e7181d07-aeab-441d-aec3-d8b482ce0247.png)

Metodo get por paginação 

![image](https://user-images.githubusercontent.com/91636663/167699008-5b06b175-8765-4256-8e2e-df3b944b03c2.png)

Metodo put para editar 
![image](https://user-images.githubusercontent.com/91636663/167699243-f97a3c19-e062-45f8-bf6b-df2b2f605086.png)
![image](https://user-images.githubusercontent.com/91636663/167699277-7cbb5e50-785c-4bf1-a3cc-3963f6cc16c9.png)

Metodo Delete para deletar 
![image](https://user-images.githubusercontent.com/91636663/167699333-e15f01d6-f911-4ff3-ace1-f1a8430ec9e4.png)
![image](https://user-images.githubusercontent.com/91636663/167699365-acfc8cca-07f7-4b74-b3df-aed638222022.png)


Foi pedido também a busca por cpf, eu tentei fazer ela da seguinte forma: 



        Na classe repository: @Repository
        public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

        Optional<Usuario>  findByCPF(String cpf);
        }

        
        Na classe Service:  public Usuario findByCPF(String cpf) {
        Optional<Usuario> obj = repo.findByCPF(cpf);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + cpf + ", Tipo: " + Usuario.class.getName()));
    }
  

        
        Na classe Resource:   @RequestMapping(value="/{cpf}", method= RequestMethod.GET)
    public ResponseEntity<Usuario> findByCPF(@PathVariable String cpf) {
        Usuario obj = service.find(Integer.valueOf(cpf));
        return ResponseEntity.ok().body(obj);
    }
mas me dava o seguinte erro sempre 
  
  ![image](https://user-images.githubusercontent.com/91636663/167699799-44187e33-bf67-4eed-99de-09ef7a9b9aa9.png)

  Oque eu fiz de errado?

