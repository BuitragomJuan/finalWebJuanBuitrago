import { Component } from '@angular/core';
import { BibliotecaService } from './biblioteca.service';
@Component({
  selector: 'app-biblioteca',
  templateUrl: './biblioteca.component.html',
  styleUrls: ['./biblioteca.component.css']
})
export class BibliotecaComponent {

  biblioteca= {Nombre: '', Direccion: '', Ciudad: ''}

  constructor(private bibliotecaservice: BibliotecaService) {}

  nuevaBiblioteca(){
    this.bibliotecaservice.addBiblioteca(this.biblioteca).subscribe(() => {
      console.log('biblioteca agregada :D');
    });

  }

}
