import { Component } from '@angular/core';
import { LibroService } from './libro.service';
@Component({
  selector: 'app-libro',
  templateUrl: './libro.component.html',
  styleUrls: ['./libro.component.css']
})
export class LibroComponent {

  Libro = {Nombre: '', Autor: '', BibliotecaId: 0}

  constructor(private libroservice: LibroService) {}

  nuevoLibro() {
    this.libroservice.addLibro(this.Libro).subscribe(() => {
      console.log("libro cargado :D");
    });

  }

}
