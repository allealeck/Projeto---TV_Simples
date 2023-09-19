public class TV implements Controle{

    int status=0, volume=0, canal=1;
    int login;
    int senha;

    public TV(int login, int senha){

        this.login = login;
        this.senha = senha;

    }

    public int getStatus() {
        return status;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getLogin() {
        return login;
    }

    public int getSenha() {
        return senha;
    }

    public int ligar_desligar(){

        if (status == 0){
            status = 1;
            return 1;
        }else{
            status = 0;
            return -1;
        }
    }
    public void aumentar_volume(){
        if(status==1){
            if(volume<100){
                volume++;
            }
        }
    }
    public void diminuir_volume(){
        if(status==1){
            if(volume>0){
                volume--;
            }
        }
    }
    public int trocar_canal(int ncanal){
        if(status==1){
            if(ncanal==1 || ncanal==3 || ncanal==5 || ncanal==7 || ncanal==11){
                canal=ncanal;
                return ncanal;
            }
        }
        return -1;
    }



}
