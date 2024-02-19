package divan.springframework.divanarticlewebapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String firstName;
        private String lastName;
        private String position;
        private String province;
        private String serviceUnit;
        @OneToMany(mappedBy = "employee")
        private Set<Article> articles = new HashSet<>();

        public Set<Article> getArticles() {
            return articles;
        }

        public void setArticles(Set<Article> articles) {
            this.articles = articles;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getServiceUnit() {
            return serviceUnit;
        }

        public void setServiceUnit(String serviceUnit) {
            this.serviceUnit = serviceUnit;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", position='" + position + '\'' +
                    ", province='" + province + '\'' +
                    ", serviceUnit='" + serviceUnit + '\'' +
                    ", articles=" + articles +
                    '}';
        }

        @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Employee employee)) return false;

                return getId() != null ? getId().equals(employee.getId()) : employee.getId() == null;
            }

            @Override
            public int hashCode() {
                return getId() != null ? getId().hashCode() : 0;
            }
    }