package br.edu.ifes.vi.eletrica.javabeginner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String notificaUsuario = new String();
    Toast notificacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "Aplicação inicializada com sucesso!");
        //Toast.makeText(this,"Aplicação inicializada com sucesso!", Toast.LENGTH_SHORT ).show();
        notificacao = Toast.makeText(this," ", Toast.LENGTH_LONG);

    }

    public void botaoClick (View view){
        exibeNotificacao("Teste do metodo de notificação");
    }

    public void exibeNotificacao (String mensagem){
        notificacao.setText(converteMaiuscula(mensagem));
        notificacao.setDuration(Toast.LENGTH_LONG);
        notificacao.show();
    }

    public String converteMaiuscula (String texto){
        String novoTexto = new String();
        novoTexto = texto.toUpperCase();
        return novoTexto;
    }
}
