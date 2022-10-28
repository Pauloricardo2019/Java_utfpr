
//Paulo Ricardo RA:2145332
public class Main {
    public static int vel;
    public static Leitura l = new Leitura();
    public static Aviao aviao = new Aviao();
    public static Caminhao caminhao = new Caminhao();
    public static Carro carro = new Carro();
    public static Navio navio = new Navio();
    public static Fisica f = new Fisica();
    public static Juridica j = new Juridica();
    public static int cargaMaxima;
    public static DbCollection db = new DbCollection();

    public static void main(String arg[]) {

        boolean continua = true;
        double valor = 0;
        int op = 0;
        int opcao = 0;
        // MENU INICIAL

        while (continua) {
            System.out.println("\n\t\t\t MENU INICIAL");
            System.out.println("\t(1)Cadastrar Pessoa");
            System.out.println("\t(2)Visualizar todos os veículos");
            System.out.println("\t(3)Visualizar perfil");
            System.out.println("\t(4)Cadastrar uma encomenda");
            System.out.println("\t(5)Visualizar todas as encomendas");
            System.out.println("\t(6)Sair");
            try {
                opcao = Integer.parseInt(l.entDados("\n\tEscolha uma opcao"));
            } catch (NumberFormatException nfe) {
                System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                l.entDados("");
                continue;
            }

            switch (opcao) {
                case 1:
                    String cond = l.entDados("Fazer cadastro como pessoa fisica ou juridica:.. <F/J>");
                    if (cond.equalsIgnoreCase("f")) {
                        try {
                            f.setNome(l.entDados("Digite seu nome:.."));
                            f.setDinheiro(Float.parseFloat(l.entDados("Digite seu capital:..")));
                            f.setIdade(Integer.parseInt(l.entDados("Digite sua idade:..")));
                            f.setGenero(l.entDados("Digite seu genero:.. <M/F>"));
                            f.setCPF(Integer.parseInt(l.entDados("Digite seu CPF:...")));
                        } catch (MenorIdadeException imx) {
                            imx.errMenorIdade();
                            break;
                        } catch (NumeroNegException nnx) {
                            nnx.errNumberNeg();
                            break;
                        } catch (NomeException nex) {
                            nex.errNome();
                            break;
                        } catch (CpfException cpx) {
                            cpx.errCpf();
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                            l.entDados("");
                            break;
                        }
                    } else if (cond.equalsIgnoreCase("j")) {
                        try {
                            j.setNome(l.entDados("Digite seu nome:.."));
                            j.setDinheiro(Float.parseFloat(l.entDados("Digite seu capital:..")));
                            j.setIdade(Integer.parseInt(l.entDados("Digite sua idade:..")));
                            j.setGenero(l.entDados("Digite seu genero:.. <M/F>"));
                            j.setCNPJ(Integer.parseInt(l.entDados("Digite seu CNPJ:...")));
                        } catch (MenorIdadeException imx) {
                            imx.errMenorIdade();
                            break;
                        } catch (NumeroNegException nnx) {
                            nnx.errNumberNeg();
                            break;
                        } catch (NomeException nex) {
                            nex.errNome();
                            break;
                        } catch (CnpjNegException cnx) {
                            cnx.errCnpj();
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                            l.entDados("");
                        }
                    } else if (!cond.equalsIgnoreCase("f") || !cond.equalsIgnoreCase("j")) {
                        System.out.println("Digite um valor valido: <F/J>!");
                        break;
                    }

                    System.out.println("\nUsuario cadastrado com sucesso!");
                    break;
                case 2:
                    showVeiculos();
                    break;
                case 3:

                    if (f.getNome() != "") {
                        System.out.println("Cadastro Pessoa fisica:");
                        System.out.println("Nome: " + f.getNome());
                        System.out.println("Dinheiro: " + f.getDinheiro());
                        System.out.println("Idade: " + f.getIdade());
                        System.out.println("Genero: " + f.getGenero());
                        System.out.println("CPF: " + f.getCPF());
                        break;
                    } else if (j.getNome() != "") {
                        System.out.println("Cadastro Pessoa Juridica:");
                        System.out.println("Nome: " + j.getNome());
                        System.out.println("Dinheiro: " + j.getDinheiro());
                        System.out.println("Idade: " + j.getIdade());
                        System.out.println("Genero: " + j.getGenero());
                        System.out.println("CNPJ: " + j.getCNPJ());
                        break;
                    }
                    System.out.println("Crie um cadastro primeiro!");
                    break;

                case 4:
                    System.out.println("Escolha um veiculo para fretear");
                    System.out.println("1) Aviao");
                    System.out.println("2) Caminhao");
                    System.out.println("3) Carro");
                    System.out.println("4) Navio");
                    try {
                        op = Integer.parseInt(l.entDados("\n\tEscolha uma opcao"));
                    } catch (NumberFormatException nfe) {
                        System.out.println("Deve ser um valor inteiro -  press <ENTER>");
                        l.entDados("");
                        continue;
                    }
                    switch (op) {
                        case 1:
                            try {
                                aviao.setTurbina(
                                        Integer.parseInt(l.entDados("Deseja um aviao de 1 ou 2 turbinas?. <1/2>")));
                                vel = aviao.getVelocidade();
                                cargaMaxima = aviao.getCargaMaxima();

                                if (aviao.getTurbina() == 2) {
                                    valor = aviao.getValorPadrao();
                                    valor = (valor * 0.5);
                                    aviao.setValorPadrao(valor);
                                }
                            } catch (TurbinaException tex) {
                                tex.errTurbina();
                                continue;
                            }
                            break;
                        case 2:
                            try {
                                caminhao.setEixo(
                                        Integer.parseInt(l.entDados("Deseja um caminhao de 1 ou 2 eixos?. <1/2>")));

                                vel = caminhao.getVelocidade();
                                cargaMaxima = caminhao.getCargaMaxima();

                                if (caminhao.getEixo() == 2) {
                                    valor = caminhao.getValorPadrao();
                                    valor = (valor * 0.5);
                                    caminhao.setValorPadrao(valor);
                                }
                            } catch (EixoException ext) {
                                ext.errEixo();
                                continue;
                            }
                            break;
                        case 3:
                            try {
                                carro.setPotencia(
                                        Float.parseFloat(l.entDados("Escolha a potencia do carro?. <1.0/2.0>")));
                                vel = carro.getVelocidade();
                                cargaMaxima = carro.getCargaMaxima();

                                if (carro.getPotencia() == 2.0) {
                                    valor = carro.getValorPadrao();
                                    valor = (valor * 0.5);
                                    carro.setValorPadrao(valor);
                                }
                            } catch (PotenciaException ptx) {
                                ptx.errPotencia();
                                continue;
                            }
                            break;
                        case 4:
                            try {
                                navio.setPorao(Integer
                                        .parseInt(l.entDados("Digite quantos poroes irá conter no navio. <1/2>")));
                                vel = navio.getVelocidade();
                                cargaMaxima = navio.getCargaMaxima();

                                if (navio.getPorao() == 2) {
                                    valor = navio.getValorPadrao();
                                    valor = (valor * 0.5);
                                    navio.setValorPadrao(valor);
                                }
                            } catch (PoraoException pxt) {
                                pxt.errPorao();
                                continue;
                            }
                        default:
                            System.out.println("Digite um valor válido!");
                            continue;
                    }

                    if (f.getNome() != "") {
                        encomendaPesFisica();

                    } else if (j.getNome() != "") {
                        encomendaPesJuridica();
                    }

                    break;
                case 5:
                   db.impEncomendas();
                    break;
                case 6:
                    continua = false;
                    break;

                default:
                    System.out.println("Digite um valor válido!");
                    break;

            } // fim do switch

        } // fim do while
    } // fim Main

    public static void showVeiculos() {
        System.out.println("Aviao: ");
        System.out.println("Tipo: " + aviao.getTipo());
        System.out.println("Velocidade: " + aviao.getVelocidade()+"Km/h");
        System.out.println("Carga maxima: " + aviao.getCargaMaxima()+"Kg");
        System.out.println("Valor: " + aviao.getValorPadrao()+"R$");
        System.out.println("\n");

        System.out.println("Caminhao: ");
        System.out.println("Tipo: " + caminhao.getTipo());
        System.out.println("Velocidade: " + caminhao.getVelocidade()+"Km/h");
        System.out.println("Carga maxima: " + caminhao.getCargaMaxima()+"Kg");
        System.out.println("Valor: " + caminhao.getValorPadrao()+"R$");
        System.out.println("\n");

        System.out.println("Carro: ");
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Velocidade: " + carro.getVelocidade()+"Km/h");
        System.out.println("Carga maxima: " + carro.getCargaMaxima()+"Kg");
        System.out.println("Valor: " + carro.getValorPadrao()+"R$");
        System.out.println("\n");

        System.out.println("Navio: ");
        System.out.println("Tipo: " + navio.getTipo());
        System.out.println("Velocidade: " + navio.getVelocidade()+"Km/h");
        System.out.println("Carga maxima: " + navio.getCargaMaxima()+"Kg");
        System.out.println("Valor: " + navio.getValorPadrao()+"R$");
        System.out.println("\n");
    }

    public static void encomendaPesFisica() {
        try {
            f.getEncomenda().setNome(l.entDados("Digite o nome da encomenda:.."));
            f.getEncomenda().setDescricao(l.entDados("Digite uma descricao:.."));
            f.getEncomenda().setDistancia(Integer.parseInt(l.entDados("Digite a distancia em km:..")));
            f.getEncomenda()
                    .setPeso(Integer.parseInt(l.entDados("Digite em kg, o peso da sua encomenda:..")));
            f.getEncomenda().calcCarga(cargaMaxima, f.getEncomenda().getPeso());
            f.getEncomenda().setValor(f.getEncomenda().calcValor(f.getEncomenda().getDistancia(),
                    f.getEncomenda().getValor()));
            f.getEncomenda().validarDinheiro(f.getDinheiro(), f.getEncomenda().getValor());
            f.getEncomenda()
                    .setDuracao(f.getEncomenda().calcTempo(f.getEncomenda().getDistancia(),
                            vel));
            f.setDinheiro((f.getDinheiro() - f.getEncomenda().getValor()));
            
            db.addEncomenda(f.getEncomenda());
        } catch (NumberFormatException nfx) {
            System.out.println("O valor deve ser um inteiro");
        } catch (NomeException nxt) {
            nxt.errNome();
            return;
        } catch (NumeroNegException ngx) {
            ngx.errNumberNeg();
            return;
        } catch (ArithmeticException axt) {
            System.out.println("Error ArithmeticException" + axt);
        } catch (DinheiroException dex) {
            dex.errDinheiro();
            return;
        } catch (CargaException cxt) {
            cxt.errCarga();
            return;
        }
        return;
    }

    public static void encomendaPesJuridica() {
        try {
            j.getEncomenda().setNome(l.entDados("Digite o nome da encomenda:.."));
            j.getEncomenda().setDescricao(l.entDados("Digite uma descricao:.."));
            j.getEncomenda().setDistancia(Integer.parseInt(l.entDados("Digite a distancia em km:..")));
            j.getEncomenda()
                    .setPeso(Integer.parseInt(l.entDados("Digite em kg, o peso da sua encomenda:..")));
            j.getEncomenda().calcCarga(cargaMaxima, j.getEncomenda().getPeso());
            j.getEncomenda().setValor(j.getEncomenda().calcValor(j.getEncomenda().getDistancia(),
                    j.getEncomenda().getValor()));
            j.getEncomenda().validarDinheiro(j.getDinheiro(), j.getEncomenda().getValor());
            j.getEncomenda()
                    .setDuracao(j.getEncomenda().calcTempo(j.getEncomenda().getDistancia(),
                            vel));
            j.setDinheiro((j.getDinheiro() - j.getEncomenda().getValor()));

            db.addEncomenda(j.getEncomenda());

        } catch (NumberFormatException nfx) {
            System.out.println("O valor deve ser um inteiro");
        } catch (NomeException nxt) {
            nxt.errNome();
            return;
        } catch (NumeroNegException ngx) {
            ngx.errNumberNeg();
            return;
        } catch (ArithmeticException axt) {
            System.out.println("Error ArithmeticException" + axt);
        } catch (DinheiroException dex) {
            dex.errDinheiro();
            return;
        } catch (CargaException cxt) {
            cxt.errCarga();
            return;
        }
        return;
    }



}
