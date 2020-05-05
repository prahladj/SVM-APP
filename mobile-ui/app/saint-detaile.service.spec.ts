import { TestBed } from '@angular/core/testing';

import { SaintDetaileService } from './saint-detaile.service';

describe('SaintDetaileService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SaintDetaileService = TestBed.get(SaintDetaileService);
    expect(service).toBeTruthy();
  });
});
