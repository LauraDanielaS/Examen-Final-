package com.primer_parcial.SyK.services;

import com.primer_parcial.SyK.models.Articulo;
import com.primer_parcial.SyK.models.Categoria;
import org.springframework.http.ResponseEntity;

public interface CategoriaService {
    ResponseEntity<Categoria> createCategoria(Categoria categoria);
    ResponseEntity<Categoria> editCategoria(Long id,Categoria categoria);
    ResponseEntity<Categoria> deleteCategoria(Long id);
}
