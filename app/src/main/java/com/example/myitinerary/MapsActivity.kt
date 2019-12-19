package com.example.myitinerary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback,
    GoogleMap.OnMarkerClickListener {
    override fun onMarkerClick(p0: Marker?) = false

    lateinit var map: GoogleMap
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_map)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        when(intent.getStringExtra("cityName")) {
            "Buenos Aires" -> {val cityLoc = LatLng(-34.612918, -58.373569)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
                "Oslo" -> {val cityLoc = LatLng(59.913902, 10.752923)
                    map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                    map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
                }
            "Tlön" -> {val cityLoc = LatLng(25.630716, 91.155004)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "London" -> {val cityLoc = LatLng(51.509294, -0.123089)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Berlin" -> {val cityLoc = LatLng(52.518945, 13.411311)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Madrid" -> {val cityLoc = LatLng(40.415655, -3.704352)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Rome" -> {val cityLoc = LatLng(41.892290, 12.492815)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Paris" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Bucharest" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Budapest" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Warsaw" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Belgrade" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Vienna" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Milan" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Munich" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Prague" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Sofia" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Napoli" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Stockholm" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Helsinki" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Copenhagen" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Montevideo" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Amsterdam" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "New York" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Barcelona" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Mexico City" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Athens" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Tokyo" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Rio" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Dublin" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Cartagena" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
            "Asuncion" -> {val cityLoc = LatLng(48.873007, 2.348188)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }

            else -> {val cityLoc = LatLng(-34.0, 151.0)
                map.addMarker(MarkerOptions().position(cityLoc).title("Marker in " + intent.getStringExtra("cityName")))
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(cityLoc, 12.0f))
            }
        }

        // Add a marker in Sydney and move the camera
//        val sydney = LatLng(-34.0, 151.0)

        map.getUiSettings().setZoomControlsEnabled(true)
        map.setOnMarkerClickListener(this)
    }

}
