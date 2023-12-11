package model;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class JtableModel extends AbstractTableModel{

	private ArrayList<classes> listaconsumo;
	private String[] colunas ={"Nome", "Quarto","Data","Descrição(Produto)", "Quantidade" , "Unidades","Total","Quanto foi pago","Forma de pagar","horaConsumida","FuncionarioResponsavel"};
	
	public JtableModel(ArrayList<classes> listaconsumo) {
		this.listaconsumo=listaconsumo;
	}
	
	@Override
	public int getRowCount() {
		return this.listaconsumo.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		classes p = listaconsumo.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} 
	
		else if(columnIndex == 1) {
			return p.getQuarto();
	} 
	else if(columnIndex == 2) {
		return p.getData();
	}
	else if(columnIndex == 3) {
		return p.getDesc();
	}
	else if(columnIndex == 4) {
		return p.getQuantidade();
	}
	else if(columnIndex == 5) {
		return p.getUnitario();
	}
	else if(columnIndex == 6) {
		return p.getTotal();
	}
	else if(columnIndex == 7) {
		return p.getPagom();
	}
	else if(columnIndex == 8) {
		return p.getMetodo();
	}
	else if(columnIndex == 9) {
		return p.getHc();
	}
	else if(columnIndex == 10) {
		return p.getResponsavel();
	}
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
