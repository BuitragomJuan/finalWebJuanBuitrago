// biblioteca.service.ts
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class BibliotecaService {
  private apiUrl = 'http://localhost:8080/api/Biblioteca';

  constructor(private http: HttpClient) {}

  addBiblioteca(bibliotecaData: any): Observable<any> {
    return this.http.post(`${this.apiUrl}`, bibliotecaData);
  }
}
