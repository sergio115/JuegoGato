package com.ponysoft.juegogato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button newBtn;
    Button exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        newBtn = findViewById(R.id.newBtn);
        exitBtn = findViewById(R.id.exitBtn);

        newBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            btn1.setText("");
            btn1.setEnabled(true);

            btn2.setText("");
            btn2.setEnabled(true);

            btn3.setText("");
            btn3.setEnabled(true);

            btn4.setText("");
            btn4.setEnabled(true);

            btn5.setText("");
            btn5.setEnabled(true);

            btn6.setText("");
            btn6.setEnabled(true);

            btn7.setText("");
            btn7.setEnabled(true);

            btn8.setText("");
            btn8.setEnabled(true);

            btn9.setText("");
            btn9.setEnabled(true);
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               System.exit(0);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("X");
                btn1.setEnabled(false);
                jugar();
                g();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("X");
                btn2.setEnabled(false);
                jugar();
                g();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText("X");
                btn3.setEnabled(false);
                jugar();
                g();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setText("X");
                btn4.setEnabled(false);
                jugar();
                g();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setText("X");
                btn5.setEnabled(false);
                jugar();
                g();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText("X");
                btn6.setEnabled(false);
                jugar();
                g();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7.setText("X");
                btn7.setEnabled(false);
                jugar();
                g();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setText("X");
                btn8.setEnabled(false);
                jugar();
                g();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setText("X");
                btn9.setEnabled(false);
                jugar();
                g();
            }
        });

    }

    void jugar() {
                
        // Jugar a ganar
        if(btn1.getText()=="O" && btn2.getText()=="O" && btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        } else if(btn1.getText()=="O" && btn3.getText()=="O" && btn2.isEnabled()) {
            btn2.setText("O");
            btn2.setEnabled(false);
        } else if(btn2.getText()=="O" && btn3.getText()=="O" && btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }

        else if(btn4.getText()=="O" && btn5.getText()=="O" && btn6.isEnabled()) {
            btn6.setText("O");
            btn6.setEnabled(false);
        } else if(btn4.getText()=="O" && btn6.getText()=="O" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn5.getText()=="O" && btn6.getText()=="O" && btn4.isEnabled()) {
            btn4.setText("O");
            btn4.setEnabled(false);
        }
        
        else if(btn7.getText()=="O" && btn8.getText()=="O" && btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        } else if(btn7.getText()=="O" && btn9.getText()=="O" && btn8.isEnabled()) {
            btn8.setText("O");
            btn8.setEnabled(false);
        } else if(btn8.getText()=="O" && btn9.getText()=="O" && btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        }
        
        else if(btn1.getText()=="O" && btn4.getText()=="O" && btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        } else if(btn1.getText()=="O" && btn7.getText()=="O" && btn4.isEnabled()) {
            btn4.setText("O");
            btn4.setEnabled(false);
        } else if(btn4.getText()=="O" && btn7.getText()=="O" && btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }

        else if(btn2.getText()=="O" && btn5.getText()=="O" && btn8.isEnabled()) {
            btn8.setText("O");
            btn8.setEnabled(false);
        } else if(btn2.getText()=="O" && btn8.getText()=="O" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn5.getText()=="O" && btn8.getText()=="O" && btn2.isEnabled()) {
            btn2.setText("O");
            btn2.setEnabled(false);
        }
        
        else if(btn3.getText()=="O" && btn6.getText()=="O" && btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        } else if(btn3.getText()=="O" && btn9.getText()=="O" && btn6.isEnabled()) {
            btn6.setText("O");
            btn6.setEnabled(false);
        } else if(btn6.getText()=="O" && btn9.getText()=="O" && btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        }

        else if(btn1.getText()=="O" && btn5.getText()=="O" && btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        } else if(btn1.getText()=="O" && btn9.getText()=="O" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn5.getText()=="O" && btn9.getText()=="O" && btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }
        
        else if(btn3.getText()=="O" && btn5.getText()=="O" && btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        } else if(btn3.getText()=="O" && btn7.getText()=="O" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn2.getText()=="O" && btn7.getText()=="O" && btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        }

        // Jugar a no dejar ganar
        else if(btn1.getText()=="X" && btn2.getText()=="X" && btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        } else if(btn1.getText()=="X" && btn3.getText()=="X" && btn2.isEnabled()) {
            btn2.setText("O");
            btn2.setEnabled(false);
        } else if(btn2.getText()=="X" && btn3.getText()=="X" && btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }

        else if(btn4.getText()=="X" && btn5.getText()=="X" && btn6.isEnabled()) {
            btn6.setText("O");
            btn6.setEnabled(false);
        } else if(btn4.getText()=="X" && btn6.getText()=="X" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn5.getText()=="X" && btn6.getText()=="X" && btn4.isEnabled()) {
            btn4.setText("O");
            btn4.setEnabled(false);
        }
        
        else if(btn7.getText()=="X" && btn8.getText()=="X" && btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        } else if(btn7.getText()=="X" && btn9.getText()=="X" && btn8.isEnabled()) {
            btn8.setText("O");
            btn8.setEnabled(false);
        } else if(btn8.getText()=="X" && btn9.getText()=="X" && btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        }
        
        else if(btn1.getText()=="X" && btn4.getText()=="X" && btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        } else if(btn1.getText()=="X" && btn7.getText()=="X" && btn4.isEnabled()) {
            btn4.setText("O");
            btn4.setEnabled(false);
        } else if(btn4.getText()=="X" && btn7.getText()=="X" && btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }

        else if(btn2.getText()=="X" && btn5.getText()=="X" && btn8.isEnabled()) {
            btn8.setText("O");
            btn8.setEnabled(false);
        } else if(btn2.getText()=="X" && btn8.getText()=="X" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn5.getText()=="X" && btn8.getText()=="X" && btn2.isEnabled()) {
            btn2.setText("O");
            btn2.setEnabled(false);
        }
        
        else if(btn3.getText()=="X" && btn6.getText()=="X" && btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        } else if(btn3.getText()=="X" && btn9.getText()=="X" && btn6.isEnabled()) {
            btn6.setText("O");
            btn6.setEnabled(false);
        } else if(btn6.getText()=="X" && btn9.getText()=="X" && btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        }

        else if(btn1.getText()=="X" && btn5.getText()=="X" && btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        } else if(btn1.getText()=="X" && btn9.getText()=="X" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn5.getText()=="X" && btn9.getText()=="X" && btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }
        
        else if(btn3.getText()=="X" && btn5.getText()=="X" && btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        } else if(btn3.getText()=="X" && btn7.getText()=="X" && btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn2.getText()=="X" && btn7.getText()=="X" && btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        }

        else if(btn5.isEnabled()) {
            btn5.setText("O");
            btn5.setEnabled(false);
        } else if(btn1.isEnabled()) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }  else if(btn3.isEnabled()) {
            btn3.setText("O");
            btn3.setEnabled(false);
        }  else if(btn7.isEnabled()) {
            btn7.setText("O");
            btn7.setEnabled(false);
        }  else if(btn9.isEnabled()) {
            btn9.setText("O");
            btn9.setEnabled(false);
        }  else if(btn2.isEnabled()) {
            btn2.setText("O");
            btn2.setEnabled(false);
        }  else if(btn4.isEnabled()) {
            btn4.setText("O");
            btn4.setEnabled(false);
        }  else if(btn6.isEnabled()) {
            btn6.setText("O");
            btn6.setEnabled(false);
        }  else if(btn8.isEnabled()) {
            btn8.setText("O");
            btn8.setEnabled(false);
        } 
    }

    void g() {

    }
}
