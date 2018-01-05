package br.com.sistematabica.view.vendas;

import br.com.sistematabica.controller.NovaVendaController;
import br.com.sistematabica.model.Cliente;
import br.com.sistematabica.model.Produto;
import br.com.sistematabica.model.Venda;
import br.com.sistematabica.model.tablemodel.NovaVendaTableModel;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe nova venda.
 *
 * @author Joel Henrique
 * @author Evelyn Mayara
 * @author Lucas Gabriel
 *
 * @version 1.00
 *
 */
public class NovaVendaGUI extends javax.swing.JFrame {

    private String nomeVendedor;
    private NovaVendaController novaVendaController = new NovaVendaController();
    private NovaVendaTableModel novaVendaTableModel = new NovaVendaTableModel();

    /**
     * Creates new form TelaNovaVenda
     */
    public NovaVendaGUI() {
        initComponents();
    }

    /**Construtor que recebe para instanciar na tela um nome de vendedor, todos os clientes e um cod numerico da venda
     *
     * @author Joel Henrique
     * @author Evelyn Mayara
     * @author Lucas Gabriel
     *
     * @version 1.00
     * @param nomeVendedor - aaa
     * @param clientes - aaa
     * @param codNumeroVenda - aaa
     *
     */
    public NovaVendaGUI(String nomeVendedor, ArrayList<Cliente> clientes, int codNumeroVenda) {
        this();

        this.nomeVendedor = nomeVendedor;
        this.lblNumeroVenda.setText("" + codNumeroVenda);

        for (Cliente i : clientes) {
            this.txtCliente.addItem(i.getDados().getNomeCompleto());
        }
    }

    /** atualiza os campos de preço na view
     *
     * @author Joel Henrique
     * @author Evelyn Mayara
     * @author Lucas Gabriel
     *
     */
    private void atualizarView() {

        double valorFinal = 0;

        for (Produto i : novaVendaTableModel.getList()) {
            valorFinal += i.getValor();
        }

        this.txtValor.setText("" + valorFinal);

        if (this.txtDesconto.getText().equals("")) {
            this.txtPrecoFinal.setText("" + valorFinal);
        } else {
            double precoFinal = valorFinal - Double.parseDouble(this.txtDesconto.getText());
            this.txtPrecoFinal.setText("" + precoFinal);
        }

    }

    public void mouseEntered(JPanel pnl1) {
        pnl1.setBackground(new Color(8, 18, 38));
        //pnl2.setBackground(new Color(8, 18, 38));
    }

    public void mouseExited(JPanel pnl1) {
        pnl1.setBackground(new Color(18, 29, 49));
        //pnl2.setBackground(new Color(18, 29, 49));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblNumeroVenda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JFormattedTextField();
        txtCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlButtonPrincipal = new javax.swing.JPanel();
        pnlSalvarVenda = new javax.swing.JPanel();
        lblTextSalvarVenda = new javax.swing.JLabel();
        lblIconSalvarVenda = new javax.swing.JLabel();
        pnlAdicionarItem = new javax.swing.JPanel();
        lblTextAdicionarItem = new javax.swing.JLabel();
        lblIconAdicionarItem = new javax.swing.JLabel();
        pnlAlterarItem = new javax.swing.JPanel();
        lblTextAlterarItem = new javax.swing.JLabel();
        lblIconAlterarItem = new javax.swing.JLabel();
        pnlExcluirItem = new javax.swing.JPanel();
        lblTextExcluirItem = new javax.swing.JLabel();
        lblIconExcluirItem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlButtonSecundario = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPrecoFinal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova venda");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(18, 29, 49));
        jPanel2.setLayout(null);

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlInfo.setLayout(null);

        lblNumeroVenda.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblNumeroVenda.setForeground(new java.awt.Color(18, 29, 49));
        lblNumeroVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroVenda.setText("16");
        pnlInfo.add(lblNumeroVenda);
        lblNumeroVenda.setBounds(20, 30, 100, 50);

        jLabel2.setForeground(new java.awt.Color(18, 29, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Numero da venda:");
        pnlInfo.add(jLabel2);
        jLabel2.setBounds(10, 10, 110, 14);

        try {
            txtDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlInfo.add(txtDataPedido);
        txtDataPedido.setBounds(300, 40, 80, 30);

        txtCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não cadastrado" }));
        pnlInfo.add(txtCliente);
        txtCliente.setBounds(140, 40, 150, 30);

        jLabel5.setText("Cliente:");
        pnlInfo.add(jLabel5);
        jLabel5.setBounds(140, 20, 60, 20);

        jLabel4.setForeground(new java.awt.Color(18, 29, 49));
        jLabel4.setText("Data do pedido:");
        pnlInfo.add(jLabel4);
        jLabel4.setBounds(300, 20, 100, 14);

        jPanel2.add(pnlInfo);
        pnlInfo.setBounds(310, 10, 400, 90);

        pnlButtonPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlButtonPrincipal.setOpaque(false);
        pnlButtonPrincipal.setLayout(null);

        pnlSalvarVenda.setBackground(new java.awt.Color(18, 29, 49));
        pnlSalvarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSalvarVendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSalvarVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSalvarVendaMouseExited(evt);
            }
        });
        pnlSalvarVenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextSalvarVenda.setForeground(new java.awt.Color(255, 255, 255));
        lblTextSalvarVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextSalvarVenda.setText("Salvar venda");
        pnlSalvarVenda.add(lblTextSalvarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 75, 20));

        lblIconSalvarVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconSalvarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/add.png"))); // NOI18N
        pnlSalvarVenda.add(lblIconSalvarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 60));

        pnlButtonPrincipal.add(pnlSalvarVenda);
        pnlSalvarVenda.setBounds(230, 0, 75, 88);

        pnlAdicionarItem.setBackground(new java.awt.Color(18, 29, 49));
        pnlAdicionarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAdicionarItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAdicionarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAdicionarItemMouseExited(evt);
            }
        });
        pnlAdicionarItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        lblTextAdicionarItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextAdicionarItem.setText("Adicionar item");
        pnlAdicionarItem.add(lblTextAdicionarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 75, 20));

        lblIconAdicionarItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/add.png"))); // NOI18N
        pnlAdicionarItem.add(lblIconAdicionarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 60));

        pnlButtonPrincipal.add(pnlAdicionarItem);
        pnlAdicionarItem.setBounds(0, 0, 75, 88);

        pnlAlterarItem.setBackground(new java.awt.Color(18, 29, 49));
        pnlAlterarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAlterarItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAlterarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAlterarItemMouseExited(evt);
            }
        });
        pnlAlterarItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextAlterarItem.setForeground(new java.awt.Color(255, 255, 255));
        lblTextAlterarItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextAlterarItem.setText("Alterar item");
        pnlAlterarItem.add(lblTextAlterarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 75, 20));

        lblIconAlterarItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAlterarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/edit.png"))); // NOI18N
        pnlAlterarItem.add(lblIconAlterarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 60));

        pnlButtonPrincipal.add(pnlAlterarItem);
        pnlAlterarItem.setBounds(80, 0, 75, 88);

        pnlExcluirItem.setBackground(new java.awt.Color(18, 29, 49));
        pnlExcluirItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExcluirItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlExcluirItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlExcluirItemMouseExited(evt);
            }
        });
        pnlExcluirItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextExcluirItem.setForeground(new java.awt.Color(255, 255, 255));
        lblTextExcluirItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextExcluirItem.setText("Excluir item");
        pnlExcluirItem.add(lblTextExcluirItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 75, 20));

        lblIconExcluirItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/delete.png"))); // NOI18N
        pnlExcluirItem.add(lblIconExcluirItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 60));

        pnlButtonPrincipal.add(pnlExcluirItem);
        pnlExcluirItem.setBounds(150, 0, 75, 88);

        jPanel2.add(pnlButtonPrincipal);
        pnlButtonPrincipal.setBounds(720, 10, 310, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/logoEsq.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 11, 270, 90);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 100));

        pnlPrincipal.setBackground(new java.awt.Color(18, 29, 49));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );

        pnlButtonSecundario.setBackground(new java.awt.Color(255, 255, 255));
        pnlButtonSecundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setForeground(new java.awt.Color(18, 29, 49));
        txtValor.setEnabled(false);
        pnlButtonSecundario.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 60, -1));

        txtDesconto.setForeground(new java.awt.Color(18, 29, 49));
        txtDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescontoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescontoKeyReleased(evt);
            }
        });
        pnlButtonSecundario.add(txtDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, -1));

        jLabel9.setBackground(new java.awt.Color(18, 29, 49));
        jLabel9.setForeground(new java.awt.Color(18, 29, 49));
        jLabel9.setText("Valor:");
        pnlButtonSecundario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));

        jLabel10.setBackground(new java.awt.Color(18, 29, 49));
        jLabel10.setForeground(new java.awt.Color(18, 29, 49));
        jLabel10.setText("Desconto:");
        pnlButtonSecundario.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        txtPrecoFinal.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        txtPrecoFinal.setForeground(new java.awt.Color(18, 29, 49));
        txtPrecoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoFinal.setText("0");
        txtPrecoFinal.setEnabled(false);
        pnlButtonSecundario.add(txtPrecoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, 50));

        jLabel11.setBackground(new java.awt.Color(18, 29, 49));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Preço final");
        pnlButtonSecundario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 30));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(724, 724, 724)
                        .addComponent(pnlButtonSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlButtonSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1210, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // salvar a venda
    private void pnlSalvarVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalvarVendaMouseClicked

        Venda venda = new Venda();
        venda.setDataCompra(this.txtDataPedido.getText());
        venda.setId(Integer.parseInt(this.lblNumeroVenda.getText()));
        venda.setCliente(this.txtCliente.getItemAt(this.txtCliente.getSelectedIndex()));
        venda.setOperadorCaixa(nomeVendedor);
        venda.setValorFinal(Double.parseDouble(this.txtPrecoFinal.getText()));

        novaVendaController.salvarVenda(venda, novaVendaTableModel);

        this.dispose();
    }//GEN-LAST:event_pnlSalvarVendaMouseClicked

    // adicionar um item no table model
    private void pnlAdicionarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdicionarItemMouseClicked

        String text = JOptionPane.showInputDialog(null, "Digite o cod do produto");

        if (text.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um codigo");
        } else {

            try {
                int cod = Integer.parseInt(text);

                if (novaVendaController.validarProdutoCod(cod)) {
                    Produto produto = novaVendaController.produtoCod(cod);

                    novaVendaTableModel.addRow(produto);
                    jTable1.setModel(novaVendaTableModel);

                    atualizarView();
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um codigo valido");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um codigo valido");
            }

        }


    }//GEN-LAST:event_pnlAdicionarItemMouseClicked

    // alterar um item no tableModel
    private void pnlAlterarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlterarItemMouseClicked

        // ser algum dado estiver selecionado na tabela
        if (jTable1.getSelectedRow() != -1) {

            try {

                int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do novo produto"));

                if (novaVendaController.validarProdutoCod(cod)) {

                    Produto produto = novaVendaController.produtoCod(cod);

                    novaVendaTableModel.removeRow(jTable1.getSelectedRow());

                    novaVendaTableModel.addRow(produto);

                    atualizarView();

                } else {
                    JOptionPane.showMessageDialog(null, "Digite um codigo valido");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um codigo valido");
            }

        } else if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Produto não selecionado");
        }


    }//GEN-LAST:event_pnlAlterarItemMouseClicked

    // deletar um item no table model
    private void pnlExcluirItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExcluirItemMouseClicked

        // ser algum dado estiver selecionado na tabela
        if (jTable1.getSelectedRow() != -1) {

            // remover no tableModel
            novaVendaTableModel.removeRow(jTable1.getSelectedRow());
            atualizarView();

        } else if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Produto não selecionado");
        }

    }//GEN-LAST:event_pnlExcluirItemMouseClicked

    private void pnlSalvarVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalvarVendaMouseEntered
        mouseEntered(pnlSalvarVenda);
    }//GEN-LAST:event_pnlSalvarVendaMouseEntered

    private void pnlAdicionarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdicionarItemMouseEntered
        mouseEntered(pnlAdicionarItem);
    }//GEN-LAST:event_pnlAdicionarItemMouseEntered

    private void pnlAlterarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlterarItemMouseEntered
        mouseEntered(pnlAlterarItem);
    }//GEN-LAST:event_pnlAlterarItemMouseEntered

    private void pnlExcluirItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExcluirItemMouseEntered
        mouseEntered(pnlExcluirItem);
    }//GEN-LAST:event_pnlExcluirItemMouseEntered

    private void pnlSalvarVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalvarVendaMouseExited
        mouseExited(pnlSalvarVenda);
    }//GEN-LAST:event_pnlSalvarVendaMouseExited

    private void pnlAdicionarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdicionarItemMouseExited
        mouseExited(pnlAdicionarItem);
    }//GEN-LAST:event_pnlAdicionarItemMouseExited

    private void pnlAlterarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlterarItemMouseExited
        mouseExited(pnlAlterarItem);
    }//GEN-LAST:event_pnlAlterarItemMouseExited

    private void pnlExcluirItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExcluirItemMouseExited
        mouseExited(pnlExcluirItem);
    }//GEN-LAST:event_pnlExcluirItemMouseExited

    private void txtDescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyPressed

    }//GEN-LAST:event_txtDescontoKeyPressed

    private void txtDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescontoKeyReleased
        atualizarView();
    }//GEN-LAST:event_txtDescontoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaVendaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIconAdicionarItem;
    private javax.swing.JLabel lblIconAlterarItem;
    private javax.swing.JLabel lblIconExcluirItem;
    private javax.swing.JLabel lblIconSalvarVenda;
    private javax.swing.JLabel lblNumeroVenda;
    private javax.swing.JLabel lblTextAdicionarItem;
    private javax.swing.JLabel lblTextAlterarItem;
    private javax.swing.JLabel lblTextExcluirItem;
    private javax.swing.JLabel lblTextSalvarVenda;
    private javax.swing.JPanel pnlAdicionarItem;
    private javax.swing.JPanel pnlAlterarItem;
    private javax.swing.JPanel pnlButtonPrincipal;
    private javax.swing.JPanel pnlButtonSecundario;
    private javax.swing.JPanel pnlExcluirItem;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSalvarVenda;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JComboBox<String> txtCliente;
    private javax.swing.JFormattedTextField txtDataPedido;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtPrecoFinal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}