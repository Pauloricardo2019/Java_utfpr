public class Main {

    public static void main(String arg[]){
        Leitura l = new Leitura();
        Aviao aviao = new Aviao();
        Caminhao caminhao = new Caminhao();
        Carro carro = new Carro();
        Navio navio = new Navio();

        boolean continua = true;
        float valor = 0;
        int op =0;
        int opcao=0;    
        int vel = 0;    
        // MENU INICIAL
        
        while(continua){
            System.out.println("\n\t\t\t MENU INICIAL");
            System.out.println("\t(1)Cadastrar Pessoa");
            System.out.println("\t(2)Visualizar todos os veículos");
            System.out.println("\t(3)Cadastrar uma encomenda");
            System.out.println("\t(4)Visualizar ftodas as encomendas");
            System.out.println("\t(5)Sair");
            try{
                    opcao= Integer.parseInt(l.entDados("\n\tEscolha uma opcao"));
            }
            catch(NumberFormatException nfe){
                    System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                    l.entDados("");
                    continue;
            }
            
            switch(opcao){
               case 1:
                    Pessoa p = new Pessoa();
                    String cond = l.entDados("Fazer cadastro como pessoa fisica ou juridica:.. <F/J>");
                    if (cond.equalsIgnoreCase("f")){
                        Fisica f = new Fisica();
                       try{
                            f.setNome(l.entDados("Digite seu nome:.."));
                            f.setDinheiro(Float.parseFloat(l.entDados("Digite a quantidade de dinheiro:..")));
                            f.setIdade(Integer.parseInt(l.entDados("Digite sua idade:..")));
                            f.setGenero(l.entDados("Digite seu genero:.. <M/F>"));
                            f.setCPF(Integer.parseInt(l.entDados("Digite seu CPF:...")));
                       }catch(IdadeMenorException imx){
                            return imx.errMenorIdade();
                            continue;
                       }catch(NumeroNegException nnx){
                            return nnx.errNumberNeg();
                            continue;
                       }catch(NomeException nex){
                            return nex.errNome();
                            continue;
                       }catch(CpfException cpx){
                            return cpx.errCpf();
                            continue;
                       }catch(NumberFormatException nfe){
                        System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                        l.entDados("");
                        continue;
                        }
                    }else if (cond.equalsIgnoreCase("j")){
                        Juridica j = new Juridica();
                        try{
                            j.setNome(l.entDados("Digite seu nome:.."));
                            j.setDinheiro(Float.parseFloat(l.entDados("Digite a quantidade de dinheiro:..")));
                            j.setIdade(Integer.parseInt(l.entDados("Digite sua idade:..")));
                            j.setGenero(l.entDados("Digite seu genero:.. <M/F>"));
                            j.setCNPJ(Integer.parseInt(l.entDados("Digite seu CPF:...")));
                        }catch(IdadeMenorException imx){
                            return imx.errMenorIdade();
                            continue;
                       }catch(NumeroNegException nnx){
                            return nnx.errNumberNeg();
                            continue;
                       }catch(NomeException nex){
                            return nex.errNome();
                            continue;
                       }catch(NumberFormatException nfe){
                        System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                        l.entDados("");
                        continue;
                        }
                    }
                    if (!cond.equalsIgnoreCase("f") || !cond.equalsIgnoreCase("j")){
                        System.out.println("Digite um valor válido!");
                        break;
                    }
                /*case 2:
                    System.out.println("Aviao: "+ aviao);
                    System.out.println("Caminhao: "+caminhao);
                    System.out.println("Carro: "+carro);
                    System.out.println("Navio: "+navio);
                
                case 3:
                    System.out.println("Escolha um veiculo para fretear");
                    System.out.println("1) Aviao: "+ aviao);
                    System.out.println("2) Caminhao: "+caminhao);
                    System.out.println("3) Carro: "+carro);
                    System.out.println("4) Navio: "+navio);
                    try{
                        op = Integer.parseInt(l.entDados("\n\tEscolha uma opcao"));
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                        l.entDados("");
                        continue;
                    }
                    switch(op){
                        case 1:
                            try{
                                Aviao a = new Aviao();
                                a.setTurbina(Integer.parseInt(l.entDados("Deseja um aviao de 1 ou 2 turbinas?. <1/2>")));
                                vel = a.getVelocidade();

                                if (a.getTurbina() == 2){
                                    valor = a.getValorPadrao();
                                    valor = (valor*0.5);
                                    a.setValorPadrao(valor);
                                }
                            }catch(){

                            }
                            
                        case 2:
                            try{
                                Caminhao cam = new Caminhao();
                                cam.setEixo(Integer.parseInt(l.entDados("Deseja um caminhao de 1 ou 2 eixos?. <1/2>")));
                                vel = cam.getVelocidade();

                               if (cam.getEixo() == 2){
                                    valor = cam.getValorPadrao();
                                    valor = (valor*0.5);
                                    cam.setValorPadrao(valor);
                                }
                            }catch(){

                            }

                        case 3:
                            //try{
                                Carro car = new Carro();
                                car.setPotencia(Float.parseFloat(l.entDados("Escolha a potencia do carro?. <1.0/2.0>")));
                                vel = car.getVelocidade();

                               if (car.getPotencia == 2.0){
                                    valor = car.getValorPadrao();
                                    valor = (valor*0.5);
                                    car.setValorPadrao(valor);
                                }
                            //}catch(){

                            //}

                        case 4:
                            try{
                                Navio nav = new Navio();
                                nav.setPorao(Integer.parseInt(l.entDados("Digite quantos poroes irá conter no navio. <1/2>"))); 
                                vel = nav.getVelocidade();
                                if(nav.getPorao() == 2){
                                    valor = nav.getValorPadrao();
                                    valor = (valor*0.5);
                                    nav.setValorPadrao(valor);
                                }
                            }catch(){

                            }
                    }
                    Encomenda e = new Encomenda();
                    try{
        
                        e.setNome(l.entDados("Digite o nome da encomenda:.."));
                        e.setDescricao(l.entDados("Digite uma descricao:.."));
                        e.setDistancia(Integer.parseInt(l.entDados("Digite a distancia em km:..")));
                        e.setPeso(Integer.parseInt(l.entDados("Digite em kg, o peso da sua encomenda:..")));
                        Encomenda encomenda = new Encomenda(e, p);

                        encomenda.setValor(encomenda.calcValor(encomenda.getDistancia(), valor));
                        encomenda.setDuracao(encomenda.calcTempo(encomenda.getDistancia(), vel));

                    }catch(NumberFormatException nfx){
                        System.out.println("O valor deve ser um inteiro");
                    }
                
                    
                case 4:
                    break;

                case 5:
                    continua = false;
                    break; 

                default:
                    System.out.println("Digite um valor válido!");
                    break;
                    */
             }  //fim do switch   
            
        }// fim do while
    }

}
