import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IProduto } from '../interfaces/IProduto';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private apiURL = 'http://localhost:8080/produto';

  constructor(private http: HttpClient) {}

  findAll(): Observable<IProduto[]> {
    return this.http.get<IProduto[]>(`${this.apiURL}/all`);
  }

  findById(id: number): Observable<IProduto> {
    return this.http.get<IProduto>(`${this.apiURL}/${id}`);
  }

  add(produto: IProduto): Observable<IProduto> {
    return this.http.post<IProduto>(`${this.apiURL}/insert`, produto);
  }

  update(produto: IProduto): Observable<IProduto> {
    return this.http.put<IProduto>(`${this.apiURL}/update`, produto);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiURL}/delete/${id}`);
  }
  
}
